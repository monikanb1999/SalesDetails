package com.example.ItemSale.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tablename")
data class Sales_entity(
        @ColumnInfo(name = "id")
        @PrimaryKey(autoGenerate = true)
        val id:Int,
        @ColumnInfo(name = "CustomerName")
        val CustomerName: String,
        @ColumnInfo(name="SalesDetails")
        val SalesDetails: Int,
        @ColumnInfo(name = "TotalAmount")
        val TotalAmount: Long,
        @ColumnInfo(name = "BalanceAmount")
        val BalanceAmount: String
)