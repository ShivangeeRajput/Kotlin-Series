package com.example.viewmodelexample

import androidx.lifecycle.ViewModel

class ViewModelStore {
    private val map: HashMap<String, ViewModel> = HashMap()

    internal fun put(key: String, viewModel: ViewModel) {
        val oldViewModel = map.put(key, viewModel)
//        oldViewModel?.onCleared()
    }

    internal fun get(key: String): ViewModel? {
        return map[key]
    }
}