package com.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScreenShots {
    private static final Logger logger = Logger.getLogger(ScreenShots.class.getName());

    public static void take(WebDriver driver, String stepName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String folderPath = "screenshots";
        String fullFileName = folderPath + "/" + stepName + "_" + timestamp + ".png";

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            new File(folderPath).mkdirs(); // crea carpeta si no existe
            FileHandler.copy(screenshot, new File(fullFileName));
            logger.info("📷 Screenshot saved: " + fullFileName);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "❌ Failed to save screenshot: " + fullFileName, e);
            throw new RuntimeException("Could not save screenshot: " + fullFileName, e);
        }
    }
}
