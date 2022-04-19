package com.example.feedthecat.screen.history

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.feedthecat.R
import com.example.feedthecat.domain.model.Achievement

class AchievementsAdapter(
    private val achievements: List<Achievement>,
    private val currentSatiety: Int
) : RecyclerView.Adapter<AchievementsAdapter.AchievementsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_achievement_item, parent, false)
        return AchievementsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AchievementsViewHolder, position: Int) {
        val item = achievements[position]
        val context = holder.itemView.context

        val tintColor = when {
            item.isAchieved -> R.color.yellow
            else -> R.color.text_secondary
        }
        holder.starIcon.setColorFilter(ContextCompat.getColor(context, tintColor))
        holder.targetText.text = item.target.toString()

        if (item.isAchieved) {
            holder.remainingText.isVisible = false
        } else {
            val remaining = item.target - currentSatiety
            holder.remainingText.isVisible = true
            holder.remainingText.text = context.getString(R.string.remaining, remaining)
        }
    }

    override fun getItemCount() = achievements.size

    inner class AchievementsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val starIcon: ImageView = view.findViewById(R.id.icon_achieved)
        val targetText: TextView = view.findViewById(R.id.text_target)
        val remainingText: TextView = view.findViewById(R.id.text_remaining)
    }
}