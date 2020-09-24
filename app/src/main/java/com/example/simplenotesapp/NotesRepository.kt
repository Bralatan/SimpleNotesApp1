package com.example.simplenotesapp

import androidx.lifecycle.LiveData

class NotesRepository(private val notesDAO: NotesDAO) {
    val allNote: LiveData<List<Notes>> = notesDAO.getAlphabetizedWords()

    suspend fun insert(name_notes: Notes){
        notesDAO.insert(name_notes)
    }
}