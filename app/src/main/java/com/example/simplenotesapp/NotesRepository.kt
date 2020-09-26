package com.example.simplenotesapp

import androidx.lifecycle.LiveData
import com.example.simplenotesapp.database.Notes
import com.example.simplenotesapp.database.NotesDAO

class NotesRepository(private val notesDAO: NotesDAO) {
    val allNote: LiveData<List<Notes>> = notesDAO.getAlphabetizedWords()

    suspend fun insert(name_notes: Notes){
        notesDAO.insert(name_notes)
    }
}