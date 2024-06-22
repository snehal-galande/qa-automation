package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class MobileSessionRecordingsPage extends BasePage {
    private By mobileSessionRecordingsHeading = By.xpath("//h1/span[text()='Mobile Session Recordings']");

    public String verifyMobileSessionRecordingsHeading(){
        presenceOfElement(mobileSessionRecordingsHeading);
        return getElement(mobileSessionRecordingsHeading).getText();
    }
}
