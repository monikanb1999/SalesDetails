package com.example.ItemSale.db

import androidx.lifecycle.LiveData

class Sales_Repository(private val tabledao: Sales_Dao)
{
    fun getrepositorytable(): LiveData<List<Sales_entity>>
    {
        return tabledao.getbalanceamount()
    }
    fun inserttablerepository(table: Sales_entity)
    {
        return tabledao.inserttable(table)
    }
}