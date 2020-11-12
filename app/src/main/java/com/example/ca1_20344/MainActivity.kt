package com.example.ca1_20344

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var modelList: MutableList<Model>? = null
    var recyclerView: RecyclerView? = null
    var mAdapter: orderAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}

