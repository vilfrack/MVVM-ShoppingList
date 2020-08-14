package com.e.mvvm_shoppinglist.data.repositories

import com.e.mvvm_shoppinglist.data.db.ShoppingDatabase
import com.e.mvvm_shoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db :ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) =db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) =db.getShoppingDao().upsert(item)
    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}