package com.example.ItemSale.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ItemSale.R

class PartiallyFragment : Fragment() {
    private val btnpay: Button? = null
    private val btndelete: Button? =null
    private val TAG = "Tab1Fragment"

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_partially, container, false)
        btnpay?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                //Your code here
            }})
        btndelete?.setOnClickListener (object :View.OnClickListener {
            override fun onClick(v: View?) {
               //code
            }
    })

    }
}