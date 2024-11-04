package com.example.coroutineExample.chainedApiCalls

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R


class UserActivity : AppCompatActivity() {
    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        // Observing user profile data
        viewModel.userProfile.observe(this) { profile ->
            // Update UI with user profile data (e.g., profile.name)
        }

        // Observing user posts data
        viewModel.userPost.observe(this) { posts ->
            // Update RecyclerView or other UI elements with user posts
        }


        // Triggering the API call chain
        viewModel.fetchUserProfileAndPosts()
    }
}
