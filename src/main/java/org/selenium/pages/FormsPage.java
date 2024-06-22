package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class FormsPage extends BasePage {
    private By formsPageHeading = By.xpath("//h1/span[text()='Form Analytics']");

    public String verifyFormsHeading(){
        presenceOfElement(formsPageHeading);
        return getElement(formsPageHeading).getText();
    }
}
