package com.test.class02;

//        public int mul(int a, int b){
//                  return a * b;
//        }

// Test Cases

//          1)   a=0,   b=5,      exp: 0
//          2)   a=0,   b=0,      exp: 0
//          3)   a=-10, b=3,      exp: -30
//          4)   a=-5,  b=-3 ,    exp: 15
//          5)   a=-5,  b=0,      exp: 0
//          6)   a=30,  b=10,     exp: 300
//          7)   a=560, b=1000,   exp: 560000


import com.main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MulTest {
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
    }

    @Test
    public void verifyWithOneZeroAndOnePositive(){
        int expResult = 0;
        int actResult = c.mul(0,5);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithOneZeroAndOtherzero(){
        int expResult = 0;
        int actResult = c.mul(0,0);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithNegative10AndPositiveThree(){
        int expResult = -30;
        int actResult = c.mul(-10,3);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndNegativeThree(){
        int expResult = 15;
        int actResult = c.mul(-5,-3);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndPositiveZero(){
        int expResult = 0;
        int actResult = c.mul(-5,0);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithPositiveThirtyAndPositiveTen(){
        int expResult =300;
        int actResult = c.mul(30,10);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithPositiveLongNumberAndPositiveLongNumber(){
        int expResult =560000;
        int actResult = c.mul(560,1000);
        Assert.assertEquals(expResult, actResult);
    }


}
