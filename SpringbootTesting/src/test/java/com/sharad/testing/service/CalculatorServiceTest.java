package com.sharad.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest    // represent the class as a spring boot test class
public class CalculatorServiceTest {

    @Autowired
    private Calculator calculator;


    @Test   // represent the method as a unit test method
    public void testAdd(){
        int actualResult=calculator.add(10, 20);
        int expectedResult=30;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsEven(){
        boolean actualResult=calculator.isEven(10);
        /*boolean expectedResult=true;
        Assertions.assertEquals(expectedResult,actualResult);*/
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testIsEvenFalse(){
        boolean actualResult=calculator.isEven(23);
        Assertions.assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints= {2,4,6,8,10})    // we can pass Double, String, Long, Float, Short, Byte, Char also
    public void testEven_3(int number){
       boolean actualResult= calculator.isEven(number);
       Assertions.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints= {3,5,7,9,11})
    public void testEven_4(int number){
        boolean actualResult= calculator.isEven(number);
        Assertions.assertFalse(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"10,20,30",
                "15,25,40",
                "5,7,12"   })
    public void addTest_2(int a, int b,int expectedResult){
        int actualResult=calculator.add(a, b);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
