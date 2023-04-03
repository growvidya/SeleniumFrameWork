package com.org.pages;

import com.org.enums.WaitType;
import org.openqa.selenium.By;
import static com.org.utils.SeleniumUtils.*;

public class LoginPage {
    private static final By TXTBOX_USERNAME = By.name("username");
    private static final By TXTBOX_PASSWORD = By.name("password");
    private static final By BUTTON_LOGIN = By.xpath("//button[@type='submit']");

    private void setUername(String username){
        sendKeys(TXTBOX_USERNAME,username,"username");

    }
    private void setPassword(String password){
        sendKeys(TXTBOX_PASSWORD,password,"password");

    }
    private void clickLogin(){
        click(BUTTON_LOGIN, WaitType.CLICKABLE,"login button");

    }

    public void loginApplication(String username, String password){
        setUername(username);
        setPassword(password);
        clickLogin();
    }

}
