package com.example.todo.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todo.Todo


@Dao
interface TodoDao {

    @Query("SELECT * FROM Todo ORDER BY date DESC")
    fun getAllTodo():LiveData<List<Todo>>

    @Insert
    fun addTodo(todo: Todo)

    @Query("Delete FROM TODO where id=:id")
    fun deleteTodo(id:Int)

}