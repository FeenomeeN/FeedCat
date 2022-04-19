package com.example.feedthecat.screen

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.feedthecat.R
import com.example.feedthecat.data.StatsRepository
import com.example.feedthecat.databinding.ActivityMainBinding
import com.example.feedthecat.db.ModelDb
import com.example.feedthecat.preferences.AchievementsPreferences
import com.example.feedthecat.screen.history.HistoryActivity
import com.example.feedthecat.screen.info.InfoActivity
import com.example.feedthecat.utils.viewModelFactory
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding: ActivityMainBinding by viewBinding()
    private val viewModel: MainViewModel by viewModels {
        viewModelFactory {
            MainViewModel(
                StatsRepository(ModelDb.getInstance(applicationContext)),
                AchievementsPreferences(getSharedPreferences("prefs", Context.MODE_PRIVATE))
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subscribeToViewModel()
        binding.feedButton.setOnClickListener {
            viewModel.feed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_about -> {
                showAboutDialog()
                true
            }
            R.id.menu_share -> {
                shareCurrentResult()
                true
            }
            R.id.menu_info -> {
                startActivity(Intent(this, InfoActivity::class.java))
                true
            }
            R.id.menu_history -> {
                startActivity(Intent(this, HistoryActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun subscribeToViewModel() {
        viewModel.satiety
            .onEach { binding.satietyNumber.text = it.toString() }
            .launchIn(lifecycleScope)

        viewModel.command
            .onEach {
                when (it) {
                    MainViewModel.Command.ANIMATE_CAT -> playCatAnimation()
                }
            }
            .launchIn(lifecycleScope)
    }

    private fun playCatAnimation() {
        binding.catView.animate().rotationBy(360f).setDuration(200).start()
    }

    private fun shareCurrentResult() {
        val shareText = getString(R.string.share_template, "today", viewModel.satiety.value)
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, shareText)
        }
        startActivity(Intent.createChooser(shareIntent, null))
    }

    private fun showAboutDialog() {
        MaterialAlertDialogBuilder(this)
            .setTitle(R.string.about)
            .setMessage(R.string.about_message)
            .setNeutralButton(android.R.string.ok) { _, _ -> }
            .show()
    }

}