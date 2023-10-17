package io.github.septianrin.coinsync.homescreen.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.septianrin.coinsync.homescreen.data.repository.HomescreenRepository

class HomescreenViewModel(private val repository: HomescreenRepository): ViewModel() {
    fun getMessage(): LiveData<String> {
       return MutableLiveData(repository.getMessage())
    }
}