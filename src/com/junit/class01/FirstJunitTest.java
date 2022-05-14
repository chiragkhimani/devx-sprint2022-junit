package com.junit.class01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstJunitTest {

    @Test
    public void verifyUserCanLoginIntoTheApp(){
        System.out.println("============ Test 1=====================");
        System.out.println("Enter correct username and password");
        System.out.println("click on login button");
        System.out.println("verify login successful");
    }

    @Test
    public void verifyUserCannotLoginWithInvalidCred(){
        System.out.println("============ Test 2=====================");
        System.out.println("Enter invalid username and password");
        System.out.println("click on login button");
        System.out.println("verify invalid login error message");
    }

    @Test
    public void verifyUserCanLogout(){
        System.out.println("============ Test 3=====================");
        System.out.println("Enter correct username and password");
        System.out.println("click on login button");
        System.out.println("verify login successful");
        System.out.println("click on logout button");
        System.out.println("verify login page is displayed");
    }

    @Before
    public void setUp(){
        System.out.println("============ Before =============");
        System.out.println("open website");
        System.out.println("verify login page is displayed");
    }

    @After
    public void cleanUp(){
        System.out.println("============ After =============");
        System.out.println("Close Browser");
    }
}
