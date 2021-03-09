package com.example.ItemSale.fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.ItemSale.Handle
import com.example.ItemSale.R
import com.example.ItemSale.databinding.Fragment1Binding
import com.example.ItemSale.databinding.Fragment2Binding
import com.example.ItemSale.db.Sales_entity
import com.example.ItemSale.ui.MainViewModel
import java.util.*

class Fragment2 : Fragment() ,Handle{

    private lateinit var vm: MainViewModel
    lateinit var binding:Fragment2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm = activity?.run {
            ViewModelProviders.of(this)[MainViewModel::class.java]
        } ?: throw Exception("Invalid Activity")
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,
                R.layout.fragment_2, container, false)
        return binding.root
    }

    override fun onAddClicked(view: View) {
        if (!TextUtils.isEmpty(binding.cusName2.text.toString()))
        {
            val table = Sales_entity(
                    0, binding.cusName2.text.toString(),
                    Calendar.getInstance().timeInMillis,
                    binding.totalAmt2.text.toString(),"0")
            vm.inserttable(table)
        }
    }

    override fun ondeleteClicked(view: View) {
        TODO("Not yet implemented")
    }


}