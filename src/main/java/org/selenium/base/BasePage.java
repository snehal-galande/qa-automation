package org.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.driver.DriverManagerTL;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected BasePage(){

    }

    protected void enterInput(By by, String key){

        DriverManagerTL.getWebDriver().findElement(by).sendKeys(key);
    }

    protected void clickElement(By by){

        DriverManagerTL.getWebDriver().findElement(by).click();
    }

    protected WebElement getElement(By key){

        return DriverManagerTL.getWebDriver().findElement(key);
    }

    protected String getMsg(By key){

        return DriverManagerTL.getWebDriver().findElement(key).getText();
    }

     protected void implicitWait(){
        DriverManagerTL.getWebDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     }

     protected WebElement presenceOfElement(By elementLocation){
        return new WebDriverWait(DriverManagerTL.getWebDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
     }


}

