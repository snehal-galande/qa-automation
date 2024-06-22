package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class SplitURLTestPage extends BasePage {
    private By splitURLHeading = By.xpath("//h1[text()='Split URL Tests']");

    public String verifySplitURLTestPageHeading(){
        presenceOfElement(splitURLHeading);
        return getElement(splitURLHeading).getText();
    }
}
