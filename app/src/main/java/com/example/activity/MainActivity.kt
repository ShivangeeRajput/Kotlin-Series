package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R
import com.example.models.MainViewModel
import com.example.models.MainViewModelFactory
import com.example.fragmentCommunication.FragmentA
import com.example.fragmentCommunication.FragmentB

class MainActivity : AppCompatActivity() {

    lateinit var tvCount: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_a, FragmentA())
            .replace(R.id.fragment_container_b, FragmentB())
            .commit()

        tvCount=findViewById(R.id.tvCount)
        mainViewModel=ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)

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