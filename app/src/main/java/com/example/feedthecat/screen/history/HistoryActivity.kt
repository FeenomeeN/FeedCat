package com.example.feedthecat.screen.history

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ConcatAdapter
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.feedthecat.R
import com.example.feedthecat.data.StatsRepository
import com.example.feedthecat.databinding.ActivityHistoryBinding
import com.example.feedthecat.db.ModelDb
import com.example.feedthecat.domain.model.Achievement
import com.example.feedthecat.domain.model.DayStat
import com.example.feedthecat.preferences.AchievementsPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HistoryActivity : AppCompatActivity(R.layout.activity_history) {

    private val binding: ActivityHistoryBinding by viewBinding()

    private lateinit var achievementsPrefs: AchievementsPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        achievementsPrefs =
            AchievementsPreferences(getSharedPreferences("prefs", Context.MODE_PRIVATE))
        val statsRepo = StatsRepository(ModelDb.getInstance(applicationContext))

        binding.toolbar.title.setText(R.string.history)
        binding.toolbar.backButton.setOnClickListener { finish() }

        lifecycleScope.launch(Dispatchers.IO) {
            setStatsAndHistory(statsRepo.getDayStats())
        }
    }

    private suspend fun setStatsAndHistory(dayStats: List<DayStat>) =
        withContext(Dispatchers.Main) {
            binding.recycler.adapter = ConcatAdapter(
                AchievementsAdapter(
                    listOf(
                        Achievement(100, achievementsPrefs.isHundredAchieved),
                        Achievement(500, achievementsPrefs.isFiveHundredAchieved),
                        Achievement(1000, achievementsPrefs.isThousandAchieved)
                    ),
                    dayStats.sumOf { it.daySatiety }
                ),
                HistoryAdapter(dayStats)
            )
        }

}