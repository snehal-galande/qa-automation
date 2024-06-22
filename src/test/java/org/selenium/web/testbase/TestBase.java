package org.selenium.web.testbase;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.selenium.driver.DriverManagerTL;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;

public class TestBase {

    @BeforeSuite
    protected void setUp() throws MalformedURLException {
        DriverManagerTL.init();
    }

    @BeforeMethod
    protected void login() {

        DriverManagerTL.login();
    }

    @AfterMethod
    protected void logout() {

        DriverManagerTL.logout();
    }

    @AfterSuite
    protected void tearDown(){

         DriverManagerTL.tearDown();
    }

    protected void takeScreenShot(String name){
        Allure.addAttachment(name,new ByteArrayInputStream(((TakesScreenshot) DriverManagerTL.getWebDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
