package com.example.viewmodelexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore

class ViewModelProvider (
    private val store: ViewModelStore,
    private val factory: Factory
) {
    fun <T: ViewModel> get(modelClass: Class<T>): T {
        var viewModel = store.get(modelClass.name)

        if(viewModel == null) {
            viewModel = factory.create(modelClass)
            store.put(modelClass.name, viewModel)
        }

        return viewModel as T
    }

    interface Factory {
        fun <T: ViewModel> create(modelClass: Class<T>): T
    }
}