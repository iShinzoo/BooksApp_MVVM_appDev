package com.example.booksapp

object Repo {
    fun getAllBooks() = listOf<Books>(
    Books(
         BookName = "Some name",
         BookPrice = "Rs 400",
         BookAuthor = "Some Xyz"
    )
    )
}