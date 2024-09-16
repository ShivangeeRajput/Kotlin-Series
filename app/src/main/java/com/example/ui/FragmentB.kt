package com.example.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kot.R
import com.example.models.SharedViewModel

class FragmentB : Fragment() {
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)

        viewModel=SharedViewModel(requireActivity()).get(SharedViewModel::class.java)
        viewModel.data.observe(viewLifecycleOwner){
            data->
            view?.findViewById<TextView>(R.id.dataTextView)?.text=data
        }
    }


}