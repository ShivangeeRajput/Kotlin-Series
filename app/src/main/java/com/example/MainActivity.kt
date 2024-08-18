package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R
import com.example.models.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var tvCount: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCount=findViewById(R.id.tvCount)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        setText()
    }

    fun setText(){
        tvCount.text=mainViewModel.count.toString()
    }
    fun increment(){
        mainViewModel.increment()
        setText()
    }
}