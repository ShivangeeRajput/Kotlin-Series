package com.example.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R
import com.example.models.SharedViewModel

class FragmentA : Fragment() {
   private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        view.findViewById<Button>(R.id.updateButton).setOnClickListener {
            viewModel.data.value = "Hello from Fragment A"
        }
    }


}