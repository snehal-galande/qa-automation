package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class ABPage extends BasePage {
    private By abHeading = By.xpath("//h1[@data-qa='page-heading']");

    public String verifyABPageHeading(){
        presenceOfElement(abHeading);
        return getElement(abHeading).getText();
    }
}
