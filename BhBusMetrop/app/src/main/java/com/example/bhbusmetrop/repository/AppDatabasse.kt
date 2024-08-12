package com.example.bhbusmetrop.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.bhbusmetrop.model.BusModel
import com.example.bhbusmetrop.repository.dao.BusDAO

@Database(entities = [BusModel:: class], version = 1)
abstract class AppDatabasse : RoomDatabase(){

    abstract fun BusDAO(): BusDAO

    companion object{
        private lateinit var INSTANCE: AppDatabasse

        fun getDataBase(context: Context): AppDatabasse{
            if(!::INSTANCE.isInitialized) {
                synchronized(AppDatabasse::class) {
                    INSTANCE =
                        Room.databaseBuilder(context, AppDatabasse::class.java, "busdb").addMigrations(
                            MIGRATION_1_2, MIGRATION_2_3).allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }

        private val MIGRATION_1_2: Migration = object : Migration(1, 2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

        private val MIGRATION_2_3: Migration = object : Migration(2, 3){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

    }

}