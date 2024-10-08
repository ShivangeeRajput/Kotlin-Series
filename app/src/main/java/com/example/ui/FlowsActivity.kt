package com.example.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kot.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class FlowsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flows)
        //consuming data
        val job=GlobalScope.launch {
           val data: Flow<Int> =producer()
           data.collect{
               Log.d("Collecting data",it.toString())
           }
       }
        //cancelling the flow after 3500ms
        GlobalScope.launch {
            delay(3500)
            job.cancel()
        }

    }
    //suspend block as by default flows create coroutines
    //producing Data
    fun producer()= flow<Int> {
        val list= listOf(1,2,3,4,5,6,7)
        list.forEach {
            delay(2000)
            emit(it)
        }
    }

}