package com.example.fragmentCommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R

class FragmentA : Fragment() {
   private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_a, container, false)
        //getting the viewmodel from activity (ViewModel Example)
        viewModel=ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        //updating  data in viewmodel when button is clicked
        view.findViewById<Button>(R.id.updateButton).setOnClickListener {
            viewModel.sharedData.value="Hello from fragment A"
        }
        return view
    }
}

//  -2 fragments can't communicate directly so we use sharedviewmodels between them