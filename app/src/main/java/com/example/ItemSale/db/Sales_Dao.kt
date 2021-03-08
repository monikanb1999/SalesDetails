package com.example.ItemSale.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Sales_Dao
{
    @Insert
    fun inserttable(table: Sales_entity)

    @Delete
    fun deletetable(table: Sales_entity)

    @Query("DELETE FROM Tablename")
    fun deleteAll()

    @Query ("SELECT * FROM Tablename")
    fun getbalanceamount(): LiveData<List<Sales_entity>>
}