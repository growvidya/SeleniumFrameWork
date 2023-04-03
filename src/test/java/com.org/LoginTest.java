package com.org;


import com.org.Annotations.FrameWorkAnnotation;
import com.org.pages.HomePage;
import com.org.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest { // logintest is type of BaseTest -- is a relation

     @DataProvider
    public static Object[][] getData() {

        return new Object[][]{
                {"Admin","admin123","OrangeHRM"}
        };
    }
    @Test(description = "Login to the application", dataProvider = "getData")
    @FrameWorkAnnotation(author = "vidya")
    public void Login(String username, String password, String expectedTitle) {
        LoginPage login = new LoginPage();
        login.loginApplication(username,password);
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.getHomePageTitle(),expectedTitle);
        //System.out.println("Title = " + DriverManager.getDriver().getTitle());
    }


}

