package com.org.pages;

import com.github.dockerjava.api.command.TopContainerCmd;
import com.org.driver.DriverManager;
import com.org.pagecomponents.FooterMenuComponents;
import com.org.pagecomponents.TopMenuComponents;

public class HomePage { // home page has Topmenu inside -- has a relation(composition where method chaining is possible)
    //homepage has topmenu -- composition
    //homepageTest is of type BaseTest - inheritance
    private TopMenuComponents topMenuComponents;
    private FooterMenuComponents footerMenuComponents;
    public HomePage(){
        topMenuComponents = new TopMenuComponents();
        footerMenuComponents = new FooterMenuComponents();
    }

    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }
    public void clickAdmin(){
        topMenuComponents.clickAdmin();
    }
    public String getFooterText(){
        return footerMenuComponents.getFooterText();
    }

}
