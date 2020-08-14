package com.e.mvvm_shoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.e.mvvm_shoppinglist.data.repositories.ShoppingRepository

class ShoppingViewModelFactory(private val repository: ShoppingRepository):ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}