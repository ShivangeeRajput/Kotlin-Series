package com.example.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kot.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

class ChannelsActivity : AppCompatActivity() {
    val channel=Channel<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_channels)
        producer()
        consumer()

    }

    fun producer(){
        CoroutineScope(Dispatchers.Main).launch {
            channel.send(1)
            channel.send(2)
        }

    }
    fun consumer(){
        CoroutineScope(Dispatchers.Main).launch {
            channel.receive()
            channel.receive()
        }

    }

}