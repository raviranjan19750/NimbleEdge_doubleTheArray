package com.example.nimbletask

class ArrayClass {

    companion object {
        init {
            System.loadLibrary("native-lib");
        }
    }

    external fun doubleThisArray(array: FloatArray): FloatArray
}