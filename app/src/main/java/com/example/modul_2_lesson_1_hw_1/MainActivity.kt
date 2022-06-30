package com.example.modul_2_lesson_1_hw_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MYLOG", "First commit")
        Log.d("MYLOG", "Second commit")

    }
}