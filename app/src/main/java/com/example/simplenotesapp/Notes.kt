package com.example.simplenotesapp

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "notes_table")
data class Notes(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name_notes") var nameNotes: String?,
    @ColumnInfo(name = "text_notes") var textNotes: String?,
    @ColumnInfo(name = "data_notes") var dataNotes: String?
)