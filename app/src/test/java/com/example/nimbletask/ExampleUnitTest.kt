package com.example.nimbletask

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testDoubleThisArray() {
        val arrayClass = ArrayClass()
        val input = floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f)
        val expectedOutput = floatArrayOf(2.0f, 4.0f,6.0f, 8.0f)
        val actualOutput =arrayClass.doubleThisArray(floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f))
        assertArrayEquals(expectedOutput, actualOutput, 0.0f)
    }
}