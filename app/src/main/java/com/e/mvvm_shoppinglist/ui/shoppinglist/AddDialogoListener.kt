package com.e.mvvm_shoppinglist.ui.shoppinglist

import com.e.mvvm_shoppinglist.data.db.entities.ShoppingItem

interface AddDialogoListener {
    fun onAddButtonClicked(item: ShoppingItem)
}