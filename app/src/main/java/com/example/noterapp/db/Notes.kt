package com.example.noterapp.db


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName="NOTES")
data class Notes (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("notes_id")
    var id: Int,


    @ColumnInfo("notes_title")
    var title : String,


    @ColumnInfo("notes_subtitle")
    var subtitle : String,

    @ColumnInfo("notes_text")
    var notesText: String,




    )