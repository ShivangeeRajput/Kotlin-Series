package com.example.chainedApiCalls

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel(private val apiService: ApiService):ViewModel() {

    private val _userProfile= MutableLiveData<UserProfile>()
    val userProfile:LiveData<UserProfile> get() = _userProfile

    private val _userPost= MutableLiveData<Post>()
    val userPost:LiveData<Post> get() = _userPost

    fun fetchUserProfileAndPosts() {
        viewModelScope.launch {

                // First API Call: Fetching User Profile
                val profile = apiService.getUserProfile()
                _userProfile.value = profile

                // Second API Call: Fetching User Posts based on User ID from Profile
                val posts = apiService.getUserPost(profile.id)
//                _userPost.value = Post


        }
    }

}