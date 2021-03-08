package com.example.ItemSale.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Sales_entity::class],version = 1,exportSchema = false)
abstract class Sales_database: RoomDatabase() {

    companion object {

        @Volatile
        private var INSTANCE: Sales_database? = null

        fun getInstance(context: Context): Sales_database {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            Sales_database::class.java,
                            "DatabaseRoom"
                    )

                            .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
    abstract fun tabledao(): Sales_Dao

}