package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class FunnelsPage extends BasePage {
    private By funnelsHeading = By.xpath("//h1[text()='Funnels ']");

    public String verifyFunnelsPageHeading(){
        presenceOfElement(funnelsHeading);
        return getElement(funnelsHeading).getText();
    }
}
