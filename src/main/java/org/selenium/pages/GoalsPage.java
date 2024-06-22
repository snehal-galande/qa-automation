package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class GoalsPage extends BasePage {
    private By goalsHeading = By.xpath("//h1[text()='Goals ']");

    public String verifyGoalsPageHeading(){
        presenceOfElement(goalsHeading);
        return getElement(goalsHeading).getText();
    }
}
