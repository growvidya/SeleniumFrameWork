package com.org;

import com.org.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest { // should contain code only related to Tests

    @BeforeMethod
    public void setup(){
        Driver.initDriver();
    }
    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }



}
