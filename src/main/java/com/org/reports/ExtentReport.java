package com.org.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.org.constants.FrameWorkConstants;


public final class ExtentReport {
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;
    private ExtentReport(){}

    public static void initReports(){
        extentReports = new ExtentReports();
        ExtentSparkReporter htmlReport = new ExtentSparkReporter(FrameWorkConstants.getReportPath());
        extentReports.attachReporter(htmlReport);
    }
    public static void flushReports(){
        extentReports.flush();
    }
    public static void createTest(String testCaseName){
        extentTest = extentReports.createTest(testCaseName);
        ExtentManager.setExtentTest(extentTest);
    }
    public static void assignAuthorName(String authorName){
        ExtentManager.getExtentTest().assignAuthor(authorName);
    }
}
