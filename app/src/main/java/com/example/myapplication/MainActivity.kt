package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.out.println("Hello World")
        System.out.println("Hello World2")
        System.out.println("Hello World 3")
        System.out.println("Hello World 4")

    }
}