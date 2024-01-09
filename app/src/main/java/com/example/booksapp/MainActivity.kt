package com.example.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {

    private lateinit var bookViewModel : BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bookViewModel = ViewModelProvider(this).get(BookViewModel::class.java)
        bookViewModel.bookLiveData.observe(this){
            Log.i("AllBooks",it.toString())
        }
    }
}