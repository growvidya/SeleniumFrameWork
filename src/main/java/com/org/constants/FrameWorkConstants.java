package com.org.constants;

public class FrameWorkConstants {
    private FrameWorkConstants(){
    }
    private final static String REPORT_PATH = System.getProperty("user.dir")+"/extentReports.html";// we dont want some one to change

    public static String getReportPath(){
        return REPORT_PATH;
    }
}
