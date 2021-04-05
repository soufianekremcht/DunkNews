package com.soufianekre.dunknews.data.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.soufianekre.dunknews.DunkNewsApp
import com.soufianekre.dunknews.data.models.NewsObject

@Database(version = 1,exportSchema = false,entities = [NewsObject::class])
abstract class AppDatabase :RoomDatabase(){


    companion object{
        private var instance :AppDatabase ? = null

        fun getInstance():AppDatabase{
            if (instance == null){
                instance = Room.databaseBuilder(
                    DunkNewsApp.getInstance(),AppDatabase::class.java,"dunk_news.db")
                    .fallbackToDestructiveMigration()

                    .build()

            }
            return instance!!
        }
    }

    abstract fun newsObjectDao() : NewsObjectDao

}