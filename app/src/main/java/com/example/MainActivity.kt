package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.kot.R

class MainActivity : AppCompatActivity() {
    var count:Int=0
    lateinit var tvCount: TextView
    lateinit var btnCount: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCount=findViewById(R.id.tvCount)
        setText()
    }
    fun increment(v:View){
        count++
        setText()
    }
    fun setText(){
        tvCount.text=count.toString()
    }
}