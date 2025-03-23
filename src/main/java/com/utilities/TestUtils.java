package com.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static com.BaseClass.driver;

public class TestUtils {
    public static String screenshotPath;
    public static void captureScreenshot() throws IOException {

        File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String timestamp = getTimeStamp();
        screenshotPath = "Screenshot" + timestamp + ".jpg";
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+screenshotPath ));
    }

    public static String getTimeStamp(){
        Date d = new Date();
        String timestamp = d.toString().replace(":"," ").replace(" ","_");
        return timestamp;
    }
}
