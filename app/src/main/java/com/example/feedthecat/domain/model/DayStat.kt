package com.example.feedthecat.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daystat")
data class DayStat(
    @PrimaryKey @ColumnInfo(name = "day") val day: Long,
    @ColumnInfo(name = "satiety") var daySatiety: Int
)