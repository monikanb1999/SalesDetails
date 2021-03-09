package com.example.ItemSale.fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.ItemSale.Handle
import com.example.ItemSale.R
import com.example.ItemSale.databinding.Fragment1Binding
import java.util.*


class Fragment1 : Fragment() ,Handle {

    lateinit var binding: Fragment1Binding
//    private val viewModel:Fragment1ViewModel by lazy {
//        ViewModelProvider(this).get(Fragment1ViewModel::class.java)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        vm = activity?.run {
//            ViewModelProviders.of(this)[MainViewModel::class.java]
//        } ?: throw Exception("Invalid Activity")
        binding.handle1=this

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_1, container, false)
        return binding.root


    }

    override fun onAddClicked(view: View) {
        if (!TextUtils.isEmpty(binding.cusName.text.toString()))
        {
//            val table = Sales_entity(
//                    0, binding.cusName.text.toString(),
//                    Calendar.getInstance().timeInMillis,
//                    binding.totAmt.text.toString(),binding.balanceAmt.text.toString())
//          viewModel.inserttable(table)
        }
    }

    override fun ondeleteClicked(view: View) {
        TODO("Not yet implemented")
    }
}