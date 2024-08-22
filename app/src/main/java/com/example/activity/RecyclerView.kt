package com.example.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kot.R

class RecyclerView : AppCompatActivity() {

    lateinit var recycler_view: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
//        recycler_view = findViewById<RecyclerView>(R.id.recycler_view)


    }
}