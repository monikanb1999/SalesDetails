package com.example.ItemSale.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
//import com.example.ItemSale.db.Sales_Repository
//import com.example.ItemSale.db.Sales_database
//import com.example.ItemSale.db.Sales_entity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//class Fragment1ViewModel (application: Application) :AndroidViewModel(application){
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