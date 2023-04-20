package com.anushka.circlecalc

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MyCalcTest {

    private lateinit var myCalc: MyCalc

    @Before
    fun setUp(){
        myCalc = MyCalc()
    }

    @Test
    fun calculateCircumference_radiusGiven_returnsCorrectResult() {

        val result = myCalc.calculateCircumference(2.1)
        assertEquals(13.188,result)
    }
    @Test
    fun calculateCircumference_zeroradius_returnsCorrectResult() {

        val result = myCalc.calculateCircumference(0.0)
        assertEquals(0.0,result)
    }
    @Test
    fun calculateArea_areagiven_resturnsCorrectResult(){
        val result = myCalc.calculateArea(2.1)
        assertEquals(13.188,result)
    }
    @Test
    fun calculateArea_zeroareag_resturnsCorrectResult(){
        val result = myCalc.calculateArea(0.0)
        assertEquals(0.0,result)
    }

}