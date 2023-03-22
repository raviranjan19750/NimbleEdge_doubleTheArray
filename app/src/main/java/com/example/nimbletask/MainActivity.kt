package com.example.nimbletask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.doublethisarray.DoubleThisArray

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doubleThisArray = DoubleThisArray()
        val answer = doubleThisArray.doubleTheArray(floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f))

        for (item in answer) {
            println(item)
            Log.d("AppCompatActivity", "onCreate: double array result : $item");
        }



    }


}