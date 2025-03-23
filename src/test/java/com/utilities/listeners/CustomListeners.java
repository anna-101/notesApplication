package com.utilities.listeners;

import com.BaseClass;
import com.aventstack.extentreports.Status;
import com.utilities.TestUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.IOException;

import static com.utilities.TestUtils.captureScreenshot;

public class CustomListeners extends BaseClass implements ITestListener{
    @Override
    public void onTestFailure(ITestResult result){
        System.setProperty("org.uncommons.reportng.escape-output","false");
        try {
            captureScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.log(Status.FAIL,result.getThrowable());
        test.log(Status.FAIL, String.valueOf(test.addScreenCaptureFromPath(TestUtils.screenshotPath)));
        Reporter.log("Click to see screenshot");
        Reporter.log("<a target=\"_blank\" href="+TestUtils.screenshotPath+">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target=\"_blank\" href="+TestUtils.screenshotPath+"><img src="+TestUtils.screenshotPath+"height=500 width=500></img></a>");

    }

    @Override
    public void onTestSuccess(ITestResult result){
        test.log(Status.PASS,result.getName().toUpperCase()+"PASS");
        extentReports.flush();
    }

    @Override
    public void onTestStart(ITestResult result){
        test = extentReports.createTest(result.getName().toUpperCase());
    }
}
