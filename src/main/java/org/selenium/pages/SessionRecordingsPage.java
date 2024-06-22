package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class SessionRecordingsPage extends BasePage {
    private By sessionRecordingsHeading = By.xpath("//h1/span[text()='Session Recordings']");

    public String verifySessionRecordingsHeading(){
        presenceOfElement(sessionRecordingsHeading);
        return getElement(sessionRecordingsHeading).getText();
    }
}
