package com.example.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel(){
    val data=MutableLiveData<String>()
}

