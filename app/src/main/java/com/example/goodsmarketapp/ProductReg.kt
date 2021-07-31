package com.example.goodsmarketapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class ProductReg : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_reg)

        var spinner : Spinner
        var sData = resources.getStringArray(R.array.my_array)
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sData)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                imgArr
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

    }
}