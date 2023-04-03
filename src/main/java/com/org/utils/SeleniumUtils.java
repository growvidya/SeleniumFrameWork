package com.org.utils;

import com.org.config.ConfigFactory;
import com.org.driver.DriverManager;
import com.org.enums.WaitType;
import com.org.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    public static void click(By by, String elementName){
        WebElement element = waitUntillElementPresent(by);
        element.click();
        ExtentLogger.info(elementName + " Element is clicked successfully" );
    }

    public static void click(By by, WaitType waitType, String elementName){
        WebElement element = null;
        if(waitType==WaitType.PRESENT) {
             element = waitUntillElementPresent(by);
        }
        else if(waitType==WaitType.CLICKABLE){
             element = elementToBeClickable(by);
        }
        else if(waitType==WaitType.VISIBLE){
            element = elementToBeVisible(by);
        }
        element.click();
        ExtentLogger.info(elementName + " Element is clicked successfully" );
    }

    public static void sendKeys(By by, String text, String elementName){
        WebElement element =waitUntillElementPresent(by);
        element.sendKeys(text);
        ExtentLogger.info(text + "as a Value is entered successfully in the "+ elementName);
    }

    private static WebElement waitUntillElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement elementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private static WebElement elementToBeVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
