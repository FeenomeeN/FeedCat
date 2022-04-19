package com.example.feedthecat.preferences

import android.content.SharedPreferences

class AchievementsPreferences(private val preferences: SharedPreferences) {

    companion object {
        private const val HUNDRED_PREF_KEY = "HUNDRED_PREF_KEY"
        private const val FIVE_HUNDRED_PREF_KEY = "FIVE_HUNDRED_PREF_KEY"
        private const val THOUSAND_PREF_KEY = "THOUSAND_PREF_KEY"
    }

    var isHundredAchieved: Boolean
        get() = preferences.getBoolean(HUNDRED_PREF_KEY, false)
        set(value) = preferences.edit().putBoolean(HUNDRED_PREF_KEY, value).apply()

    var isFiveHundredAchieved: Boolean
        get() = preferences.getBoolean(FIVE_HUNDRED_PREF_KEY, false)
        set(value) = preferences.edit().putBoolean(FIVE_HUNDRED_PREF_KEY, value).apply()

    var isThousandAchieved: Boolean
        get() = preferences.getBoolean(THOUSAND_PREF_KEY, false)
        set(value) = preferences.edit().putBoolean(THOUSAND_PREF_KEY, value).apply()

    fun updateAchievements(value: Int) {
        when (value) {
            100 -> isHundredAchieved = true
            500 -> isFiveHundredAchieved = true
            1000 -> isThousandAchieved = true
        }
    }

}