package com.org.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private ExtentManager(){}
    public static ThreadLocal<ExtentTest> thread = new ThreadLocal<>();
    static ExtentTest getExtentTest(){
        return thread.get();
    }
    static void setExtentTest(ExtentTest test){
        thread.set(test);
    }
}
