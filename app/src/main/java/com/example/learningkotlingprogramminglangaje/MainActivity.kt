package com.example.learningkotlingprogramminglangaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declaring variables and constants
        variablesAndConstants();
        // all kotlin data types
        dataTypes();
        // if statements
        ifStatements();
    }

    private fun variablesAndConstants(){
        println("Declaring variables and constants:");
        // constants
        val age: Int = 15;
        println(age);

        // variables
        var name = "Alvaro";
        println(name);
        name = "Brad";
        println(name);
    }

    private fun dataTypes(){
        println("Data Types in Kotlin:");
        // strings
        val name: String = "Alvaro";
        val surname: String = "Barrero";
        // string concatenation using + operator
        var fullName = name + " " + surname;
        // easier way of string formatting
        fullName = "$name $surname";
        println(fullName);

        // numeric data types and + operator for each them
        // whole numbers (Byte: 8b Short: 16b Int: 32b Long: 64b)
        val number1: Byte = 5;
        val number2: Byte = 15;
        println(number1 + number2);

        // decimal numbers (float: 32b, double: 64b)
        val floatNumber: Float = 2.5f;
        println(floatNumber + 2.1f);

        val doubleNumber: Double = 2.2;
        println(doubleNumber + 1.5)

        // boolean data type
        val isOnGround = true;
        println(isOnGround);
        val canFly = false;
        println(canFly);

        // logical operators
        println(isOnGround == canFly);
        println(isOnGround && canFly);
        println(isOnGround || canFly);
    }

    private fun ifStatements() {
        // if conditional

    }

}