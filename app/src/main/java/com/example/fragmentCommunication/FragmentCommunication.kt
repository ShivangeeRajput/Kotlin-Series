package com.example.fragmentCommunication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R


class FragmentCommunication : Fragment() {
    private lateinit var viewModel: SharedViewModel


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_communication, container, false)
        viewModel=ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        viewModel.sharedData.observe(viewLifecycleOwner){data->
            view.findViewById<TextView>(R.id.dataTextView).text=data
        }
        return view
    }
}