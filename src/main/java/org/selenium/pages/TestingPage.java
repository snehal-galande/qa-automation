package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class TestingPage extends BasePage {
    private By testingButton = By.xpath("//span[text()='Testing']");
    private By abButton = By.xpath("//span[text()='Testing']/../../ul//li/a//span[text()='A/B']");
    private By multivaiateButton = By.xpath("//span[text()='Testing']/../../ul/li/a//span[text()='Multivariate']");
    private By splitURLButton = By.xpath("//span[text()='Testing']/../../ul/li/a//span[text()='Split URL']");
    private By mobileAppAbButton = By.xpath("//span[text()='Testing']/../../ul/li/a//span[text()='Mobile App A/B']");

    public String verifyTestingOptionOnDashboard(){
        presenceOfElement(testingButton);
        return getElement(testingButton).getText();
    }

    public void clickOnTestingButton()  {

        clickElement(testingButton);
    }

    public String verifyABButtonPresentInTestingOption(){
        presenceOfElement(abButton);
        return getElement(abButton).getText();
    }


    public void clickOnABButton(){

        clickElement(abButton);
    }


    public ABPage testingToABPage(){

        return new ABPage();
    }

    public String verifyMultivaiateButtonOnDashbaord(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        presenceOfElement(multivaiateButton);
        return getElement(multivaiateButton).getText();
    }

    public void clickOnMultivariateButton(){

        clickElement(multivaiateButton);
    }

    public MultivariateTestPage testingToMultivariatePage(){

        return new MultivariateTestPage();
    }

    public String verifySplitURLButtonOnDashboard(){
        presenceOfElement(splitURLButton);
        return getElement(splitURLButton).getText();
    }

    public void clickOnSplitURLButton(){

        clickElement(splitURLButton);
    }

    public SplitURLTestPage testingToSplitURLPage(){

        return new SplitURLTestPage();
    }

    public String verifyMobileAppAbbuttonOnDashbaord(){
        presenceOfElement(mobileAppAbButton);
        return getElement(mobileAppAbButton).getText();
    }

    public void clickOnMobileAppAbButton(){

        clickElement(mobileAppAbButton);
    }

    public MobileAppABTestPage testingToMobileAppAbButtonOnDashboard(){
        return new MobileAppABTestPage();
    }


}
