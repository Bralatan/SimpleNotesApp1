package com.example.simplenotesapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NotesDAO {
    @Query("SELECT * from notes_table ORDER BY name_notes ASC")
    fun getAlphabetizedWords(): LiveData<List<Notes>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(name_notes:Notes)

    @Query("DELETE FROM notes_table")
    suspend fun deleteAll()
}