package com.example.chainedApiCalls

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel:ViewModel() {
    private val userProfile= MutableLiveData<UserProfile>()

}