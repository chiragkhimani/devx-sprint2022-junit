package com.test.class02;

//        public int div(int a, int b){
//                  return a / b;
//        }

// Test Cases

//          1)   a=5,   b=5,      exp: 1
//          2)   a=5,   b=1,      exp: 5
//          3)   a=1 , b=5,      exp: 0
//          4)   a=-15,  b=-3 ,    exp:5
//          5)   a=-15,  b=3,      exp: -5
//          6)   a= 0,  b =0,     exp: Exception
//          7)   a=1000, b=250,   exp: 4
//          8)   a = -20, b = 40  exp: 0


import com.main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivTest {
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
    }

    @Test
    public void verifyWithOneZeroAndOnePositive(){
        int actResult = c.div(0,0);
        Assert.fail("No Exception thrown");
    }

    @Test
    public void verifyWithOneZeroAndOtherzero(){
        int expResult = 1;
        int actResult = c.div(5,5);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithNegative10AndPositiveThree(){
        int expResult = -2;
        int actResult = c.div(-10,5);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndNegativeThree(){
        int expResult = -2;
        int actResult = c.div(10,-5);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndPositiveZero(){
        int expResult = 0;
        int actResult = c.div(10,20);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithPositiveThirtyAndPositiveTen(){
        int expResult =0;
        int actResult = c.div(1,10);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithPositiveLongNumberAndPositiveLongNumber(){
        int expResult =1;
        int actResult = c.div(-5,-5);
        Assert.assertEquals(expResult, actResult);
    }


}
