package com.example.ItemSale

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


class SalesDetail : AppCompatActivity(),Handler {
    private val TAG = "MainActivity"

    private var mSectionsPageAdapter: SectionsPageAdapter? = null

    private val mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_sales)
        Log.d(TAG, "onCreate: Starting.");


    }


}