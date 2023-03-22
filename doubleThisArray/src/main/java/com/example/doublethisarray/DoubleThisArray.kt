package com.example.doublethisarray


 class DoubleThisArray {

     companion object {
         init {
             System.loadLibrary("native-lib")
         }
     }
     external fun doubleTheArray(array: FloatArray): FloatArray

}