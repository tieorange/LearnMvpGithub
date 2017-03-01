package com.infullmobile.learnmvpgithub

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito
import org.mockito.Mockito.mock
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun mockito() {
        val mockedList = mock(LinkedList::class.java)
        Mockito.`when`(mockedList[0]).thenReturn("first")

        println("mockedList[0] = ${mockedList[0]}")

        println("mockedList[999] = ${mockedList[999]}")

    }
}