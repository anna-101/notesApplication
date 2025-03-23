package com.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsManager {
    private static ExtentReports extent;
    private static ExtentSparkReporter extentSparkReporter;

    public static ExtentReports getinstance(){
        if(extent==null){
            extent = new ExtentReports();
            extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\test-output\\extent.html");
            extent.attachReporter(extentSparkReporter);

            extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
            extentSparkReporter.config().setReportName("Test Report");
            extentSparkReporter.config().setTheme(Theme.STANDARD);
            extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        }
        return extent;
    }
}
