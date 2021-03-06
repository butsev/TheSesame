package com.paysafe.hackathon.thesesame.ui.fragments.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HomeViewModelFactory() : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel() as T
    }
}