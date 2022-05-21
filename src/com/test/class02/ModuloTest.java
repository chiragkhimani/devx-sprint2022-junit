package com.test.class02;

//        public int modulo(int a, int b){
//                  return a % b;
//        }

// Test Cases

//          1)   a = 9 ,   b = 5,      exp: 4
//          2)   a = 5,   b = 1,      exp: 0
//          3)   a = 1 , b = 5,      exp: 1
//          4)   a=-15,  b=-3 ,    exp: 0
//          5)   a=-15,  b= 4,      exp: -3
//          6)   a= 15,  b =-4,     exp: 3


import com.main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ModuloTest {
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
    }

    @Test
    public void verifyWithOneZeroAndOtherzero(){
        int expResult = 4;
        int actResult = c.modulo(9,5);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithNegative10AndPositiveThree(){
        int expResult = 0;
        int actResult = c.modulo(5,1);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndNegativeThree(){
        int expResult = 1;
        int actResult = c.modulo(1,5);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndPositiveZero(){
        int expResult = 0;
        int actResult = c.modulo(-15,-3);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithPositiveThirtyAndPositiveTen(){
        int expResult =-3;
        int actResult = c.modulo(-15,4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen1(){
        int expResult =3;
        int actResult = c.modulo(15,-4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen2(){
        int expResult =0;
        int actResult = c.modulo(0,4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen3(){
        int expResult =0;
        int actResult = c.modulo(15,0);
        Assert.assertEquals(expResult, actResult);
    }

}
