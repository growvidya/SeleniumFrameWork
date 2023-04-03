package com.org;

import com.org.pages.HomePage;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest{ // is a relation

    @Test
    public void VerifyHomePageMenuComponents(){
        HomePage homePage = new HomePage();
        homePage.getHomePageTitle();
        homePage.clickAdmin();
    }

}
