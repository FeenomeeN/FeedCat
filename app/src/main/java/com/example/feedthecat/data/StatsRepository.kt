package com.example.feedthecat.data

import com.example.feedthecat.db.AppDatabase
import com.example.feedthecat.domain.model.DayStat

class StatsRepository(private val database: AppDatabase) : IStatsRepository {

    override suspend fun getDayStats() = database.statsDao.getDayStats()

    override suspend fun addDayStat(dayStat: DayStat) = database.statsDao.addDayStat(dayStat)

}

interface IStatsRepository {

    suspend fun getDayStats(): List<DayStat>

    suspend fun addDayStat(dayStat: DayStat)

}