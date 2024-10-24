package com.example.fragmentCommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R

class FragmentB : Fragment() {
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_b, container, false)
        //getting the viewmodel
         viewModel=ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
         viewModel.sharedData.observe(viewLifecycleOwner) { data ->
            // Updating the TextView with the new data
            view.findViewById<TextView>(R.id.dataTextView).text = data
        }
        return view
    }
}