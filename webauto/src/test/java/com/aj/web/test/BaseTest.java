package com.aj.web.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void init(){

        System.out.println("Test");

        Assert.assertTrue(true);
    }
}
