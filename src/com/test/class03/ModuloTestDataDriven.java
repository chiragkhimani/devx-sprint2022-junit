package com.test.class03;

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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ModuloTestDataDriven {
    Calculator c;

    int num1;
    int num2;
    int expResult;

    public ModuloTestDataDriven(int num1, int num2, int expResult) {
        this.num1 = num1;
        this.num2 = num2;
        this.expResult = expResult;
    }

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void verifyWithOneZeroAndOtherzero() {
        int actResult = c.modulo(num1, num2);
        Assert.assertEquals(expResult, actResult);
    }

    @Parameterized.Parameters(name="Running with {0} and {1}, expecting {2}")
    public static List<Integer[]> supplyData() {
        Integer data[][] = {
                {9, 5, 4},
                {5, 1, 0},
                {1, 5, 1},
                {-15, -3, 0},
                {-15, 4, -3},
                {9, 5, 4},
                {5, 1, 0},
                {1, 5, 1},
                {-15, -3, 0},
                {-15, 4, -3},
        };
        return Arrays.asList(data);
    }

}
