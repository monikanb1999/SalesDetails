package com.example.ItemSale.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.ItemSale.R
import com.example.ItemSale.databinding.DetailSalesBinding
import com.example.ItemSale.fragments.Fragment1
import com.example.ItemSale.fragments.Fragment2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import kotlinx.android.synthetic.main.detail_sales.*


class SalesDetail : AppCompatActivity() {
    private val mRecyclerView: RecyclerView? = null
//    private val mAdapter: ExampleAdapter? = null
    private val mLayoutManager: RecyclerView.LayoutManager? = null
  lateinit var binding:DetailSalesBinding
  var fragment:Fragment?=null
    var fragmentManager: FragmentManager? = null
    var fragmentTransaction: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DetailSalesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragment = Fragment1()
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager!!.beginTransaction()
        fragmentTransaction!!.replace(R.id.frameLayout, fragment as Fragment1)
        fragmentTransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction!!.commit()
        binding.tablayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {

                when (tab.position) {
                    0 -> {
                        fragment = Fragment1()
                    }
                    else -> {
                        fragment = Fragment2()

                    }

                }
                val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                ft.replace(R.id.frameLayout, fragment!!)
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                ft.commit()


            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

//        createExampleList()
//        buildRecyclerView()


        var editTextHello = findViewById(R.id.search_view) as EditText
        Toast.makeText(this, editTextHello.text, Toast.LENGTH_SHORT).show()
        search_view.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                filter(s.toString())
            }

            private fun filter(text: String) {
//                val filteredList: ArrayList<ExampleItem> = ArrayList()
//                var mExampleList
//                for (item in mExampleList) {
//                    if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
//                        filteredList.add(item)
//                    }
//                }
//                mAdapter.filterList(filteredList)
            }
        })

        }

//     fun loadFragment(fragment: Fragment?, tag: String): Boolean {
//        //switching fragment
//        if (fragment != null) {
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.framelayout, fragment, tag)
//                .addToBackStack(null)
//                .commit()
//            return true
//        }
//        return false
//    }


}