package com.org;

import com.org.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(description = "Login to the application")
    public void Login() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        driver.get(config.url());
        driver.findElement(By.name("Username")).sendKeys("testvidya");
        driver.findElement(By.name("Password")).sendKeys(("TestVidya23"));
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println("Title = " + driver.getTitle());
        driver.quit();
    }

}

