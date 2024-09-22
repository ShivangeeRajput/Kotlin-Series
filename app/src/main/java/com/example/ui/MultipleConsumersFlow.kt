package com.example.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kot.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MultipleConsumersFlow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple_consumers_flow)

        GlobalScope.launch(Dispatchers.Main) {
            producer().collect{
                Log.d("Collecting data -1",it.toString())
            }
        }

        GlobalScope.launch {
            val data: Flow<Int> =producer()
            data.collect{
                delay(2500)
                Log.d("Collecting data -2",it.toString())
            }
        }

    }
     fun producer()= flow<Int> {
         val list= listOf(1,2,3,4,5)
         list.forEach {
             delay(1000)
             emit(it)
         }
     }


}