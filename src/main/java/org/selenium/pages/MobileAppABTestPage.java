package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class MobileAppABTestPage extends BasePage {
    private By MobileAppAbHeading = By.xpath("//h1[text()=' Mobile App A/B Tests ']");

    public String verifyMobileAppAbTestPageHeading(){
        presenceOfElement(MobileAppAbHeading);
        return getElement(MobileAppAbHeading).getText();
    }
}
