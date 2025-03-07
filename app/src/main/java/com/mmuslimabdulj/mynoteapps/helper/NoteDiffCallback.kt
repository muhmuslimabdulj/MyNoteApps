package com.mmuslimabdulj.mynoteapps.helper

import androidx.recyclerview.widget.DiffUtil
import com.mmuslimabdulj.mynoteapps.database.Note

class NoteDiffCallback(private val oldNoteList: List<Note>, private val newNoteList: List<Note>) :
    DiffUtil.Callback() {

    override fun getNewListSize(): Int {
        return newNoteList.size
    }

    override fun getOldListSize(): Int {
        return oldNoteList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldNoteList[oldItemPosition].id == newNoteList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldNote = oldNoteList[oldItemPosition]
        val newNote = newNoteList[newItemPosition]
        return oldNote.title == newNote.title && oldNote.description == newNote.description
    }
}