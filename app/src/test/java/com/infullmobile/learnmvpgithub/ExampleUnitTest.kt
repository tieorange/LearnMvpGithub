package com.infullmobile.learnmvpgithub

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
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

        val first = mockedList[0]
        assertEquals("must be FIRST", "first", first)
        println("mockedList[0] = $first")

        val last = mockedList[999]
        assertEquals("must be null", null, last)
        println("mockedList[999] = $last")
    }

    @Test
    fun verifyMethodCalled(){
        val list = mock(ArrayList::class.java)
        list.clear()

        verify(list).clear()
    }
}