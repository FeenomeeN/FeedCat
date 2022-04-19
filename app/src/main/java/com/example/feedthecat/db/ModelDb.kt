package com.example.feedthecat.db

import android.content.Context
import androidx.room.Room

object ModelDb {

    fun getInstance(context: Context) =
        Room.databaseBuilder(context, AppDatabase::class.java, "db").build()

}