package org.selenium.web.tests;

import org.assertj.core.api.Assertions;
import org.selenium.driver.DriverManagerTL;
import org.selenium.pages.DashboardPage;
import org.selenium.pages.LoginPage;
import org.selenium.utils.PropertyReader;
import org.selenium.web.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test(priority = 1)
    public void testVWOLogin_Negative() throws InterruptedException {
        //1.Enter the URL
        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
        DriverManagerTL.getWebDriver().manage().window().maximize();
        String expctedError = new LoginPage().invalidLoginToVWO().invalidErrorMsg();
        Assertions.assertThat(expctedError).isNotNull().contains(PropertyReader.readKey("expected_error"));
    }

    @Test(priority = 2)
    public void testVWOLogin_Positive(){
        String url = PropertyReader.readKey("url");
        System.out.println(url);
        DriverManagerTL.getWebDriver().get(url);
        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().loginToVWO().afterLogin();
        String expectedResult = dashboardPage.loggedInUserName() ;
        Assertions.assertThat(expectedResult).isNotBlank().isNotNull().contains(PropertyReader.readKey("expected_username"));
        System.out.println(expectedResult);
    }
//    @Test
//    public void demoMethod(){
//        DriverManagerTL.getWebDriver().get("https://courses.thetestingacademy.com/");
//        System.out.println("Hello");
//    }

}
