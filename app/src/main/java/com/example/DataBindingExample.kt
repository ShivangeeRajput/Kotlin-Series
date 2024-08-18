package com.example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.kot.R
import com.example.kot.databinding.ActivityDataBindingExampleBinding

class DataBindingExample : AppCompatActivity() {
    lateinit var binding: ActivityDataBindingExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_data_binding_example)
        binding.tvQuote.text="Do Good and Good will Come to you"
        binding.tvAuthor.text="Unknown"
    }
}