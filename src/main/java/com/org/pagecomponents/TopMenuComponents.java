package com.org.pagecomponents;

import com.org.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class TopMenuComponents {// is inside the Homepage
    private static final By MENU_ITEM = By.xpath("//a[@class='oxd-main-menu-item']/child::span[text()='Admin']");
    public void clickAdmin(){
        SeleniumUtils.click(MENU_ITEM,"Admin");
    }
}
