package com.example.todo.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.todo.Todo;

@Database(entities =[Todo::class], version = 1,exportSchema = false)
@TypeConverters(Converter.class)
abstract class TodoDatabase : RoomDatabase() {

        companion object {
        const val NAME = "Todo_DB"
        }

        abstract fun getTodoDao():TodoDao
}