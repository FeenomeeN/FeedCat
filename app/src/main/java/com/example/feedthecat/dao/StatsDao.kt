package com.example.feedthecat.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.feedthecat.domain.model.DayStat

@Dao
interface StatsDao {

    @Query("SELECT * FROM daystat")
    suspend fun getDayStats(): List<DayStat>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addDayStat(dayStat: DayStat)

}