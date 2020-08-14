package com.e.mvvm_shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.e.mvvm_shoppinglist.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_item")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>>
}