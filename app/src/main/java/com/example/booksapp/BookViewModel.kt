package com.example.booksapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {

    val bookLiveData = MutableLiveData<List<Books>>()

    init {
        getAllBooks()
    }

    fun getAllBooks(){
        val allBook = Repo.getAllBooks()
            bookLiveData.value = allBook
    }
}