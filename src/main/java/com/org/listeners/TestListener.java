package com.org.listeners;

import com.org.Annotations.FrameWorkAnnotation;
import com.org.reports.ExtentLogger;
import com.org.reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListener implements ITestListener {


    public void onTestStart(ITestResult result) {
      // ExtentReport.createTest(result.getName());
        ExtentReport.createTest(result.getMethod().getDescription());
        ExtentReport.assignAuthorName(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameWorkAnnotation.class).author());
    }

     public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName()+" is Passed");
    }

     public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName() + " is Failed");
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }

     public void onStart(ITestContext context) {
         ExtentReport.initReports();
    }

     public void onFinish(ITestContext context) {
         ExtentReport.flushReports();
    }

}
