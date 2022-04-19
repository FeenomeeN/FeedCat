package com.example.feedthecat.screen

import android.text.format.DateUtils
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feedthecat.data.IStatsRepository
import com.example.feedthecat.domain.model.DayStat
import com.example.feedthecat.preferences.AchievementsPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.launch
import java.math.BigDecimal
import java.math.RoundingMode

class MainViewModel(
    private val statsRepository: IStatsRepository,
    private val achievementsPreferences: AchievementsPreferences
) : ViewModel() {

    companion object {
        const val ANIMATION_DELTA = 15
    }

    private val _satiety = MutableStateFlow(0)
    val satiety: StateFlow<Int> = _satiety

    private val _command = MutableSharedFlow<Command>()
    val command: Flow<Command> = _command

    private val stats = flow { emit(statsRepository.getDayStats()) }

    private val _currentDay = MutableStateFlow(DayStat(todayInMillis, 0))

    private val todayInMillis: Long
        get() = BigDecimal(System.currentTimeMillis()).divide(
            BigDecimal(DateUtils.DAY_IN_MILLIS),
            RoundingMode.DOWN
        ).toLong()

    init {
        viewModelScope.launch {
            stats.collect { dayStats ->
                dayStats
                    .find { dayStat -> dayStat.day == todayInMillis }
                    ?.let { _currentDay.value = it }

                _satiety.value = dayStats.sumOf { it.daySatiety }
            }
        }
        satiety
            .onEach { animateCatIfNeeded(it) }
            .launchIn(viewModelScope)
    }

    fun feed() {
        _satiety.value = _satiety.value + 1
        achievementsPreferences.updateAchievements(_satiety.value)
        _currentDay.value.daySatiety = _currentDay.value.daySatiety + 1
        saveTodayStat()
    }

    fun saveTodayStat() {
        viewModelScope.launch { statsRepository.addDayStat(_currentDay.value) }
    }

    private suspend fun animateCatIfNeeded(satietyValue: Int) {
        if (satietyValue % ANIMATION_DELTA == 0) {
            _command.emit(Command.ANIMATE_CAT)
        }
    }

    enum class Command {
        ANIMATE_CAT
    }

}