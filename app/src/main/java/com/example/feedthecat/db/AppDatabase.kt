package com.example.feedthecat.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.feedthecat.dao.StatsDao
import com.example.feedthecat.domain.model.DayStat

@Database(version = 1, entities = [DayStat::class], exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract val statsDao: StatsDao
}