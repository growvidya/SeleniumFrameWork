package com.org.driver;

import com.org.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public final class Driver {

    private Driver(){}

    public static void initDriver(){
        String browser = ConfigFactory.getConfig().browser();
        if(DriverManager.getDriver()==null) {
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDeriver(driver);//setting driver to thead soon creating the driver instance
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }
    }

    public static void quitDriver(){
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }

    }
}
