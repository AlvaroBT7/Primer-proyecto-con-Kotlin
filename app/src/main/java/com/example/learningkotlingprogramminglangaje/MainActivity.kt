package com.example.learningkotlingprogramminglangaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloWorld();
    }

    private fun helloWorld(){
        val name: String = "Alvaro";
        println(name);
    }
}