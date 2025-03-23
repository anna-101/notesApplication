package com;//import io.appium.java_client.android.AndroidDriver;


//import io.appium.java_client.android.AndroidDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.utilities.ExtentReportsManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.logging.Logger;

public class BaseClass {
    public static final Logger logger = Logger.getLogger(String.valueOf(BaseClass.class));

    public static ExtentReports extentReports = ExtentReportsManager.getinstance();
    public static ExtentTest test;
    public static AndroidDriver driver;
    public static void init() throws MalformedURLException {
        UiAutomator2Options capabilities = new UiAutomator2Options();
        capabilities.setPlatformName(MobilePlatform.ANDROID);
        capabilities.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setDeviceName("realme RMX3840");
        capabilities.setApp("C:\\Users\\DELL\\Downloads\\NotesLauncher.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean awaitForElementPresent(By by){
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch(TimeoutException e) {
            e.printStackTrace();
        }
        logger.info("Element could not be located");
        return false;
    }

    public boolean awaitForElementToBeClickable(By by){
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        }catch(TimeoutException e) {
            e.printStackTrace();
        }
        logger.info("Element could not be located");
        return false;
    }

    public void quit(){
        driver.quit();
    }

    //get started - //android.view.ViewGroup[@resource-id="com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_get_started"]
}
