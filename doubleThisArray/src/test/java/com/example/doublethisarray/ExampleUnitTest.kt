package com.example.doublethisarray

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DoubleThisArrayTest {

    companion object{
        init {
            System.loadLibrary("native-lib")
        }
    }


    @Test
    fun testDoubleThisArray() {
        val arrayClass = DoubleThisArray()
        val expectedOutput = floatArrayOf(2.0f, 4.0f,6.0f, 8.0f)
        val actualOutput = arrayClass.doubleTheArray(floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f))
        assertArrayEquals(expectedOutput, actualOutput, 0.0f)
    }
}