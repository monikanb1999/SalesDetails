package com.example.ItemSale.ui

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//class MainViewModel (application: Application): AndroidViewModel(application) {
//    private val tableRespository1: Sales_Repository
//
//    init {
//        val dao = Sales_database.getInstance(getApplication()).tabledao()
//        tableRespository1 = Sales_Repository(dao)
//    }
//
//    fun inserttable(table: Sales_entity) = viewModelScope.launch(Dispatchers.IO) {
//        tableRespository1.inserttablerepository(table)
//    }
//}
//
//    init {
//        val dao1 = Sales_database.getInstance(getApplication()).tabledao()
//        tableRespository1= Sales_Repository(dao1)
//    }
//    fun inserttable
//    fun inserttable(table: Sales_entity)= viewModelScope.launch(Dispatchers.IO) {
//        tableRespository1.inserttablerepository(table)
//    }
