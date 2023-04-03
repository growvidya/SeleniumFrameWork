package com.org.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {// allows threads to run parllel
    private static final ThreadLocal<WebDriver> thread = new ThreadLocal<>(); // will not change
    private DriverManager(){}

    public static WebDriver getDriver(){
        return thread.get();
    }
    public static void setDeriver(WebDriver driver){
        thread.set(driver);
    }

}
