package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class SurveysPage extends BasePage {
    private By surveysPageHeading = By.xpath("//h1[text() ='On-page Surveys']");

    public String verifySurveysHeading(){
        presenceOfElement(surveysPageHeading);
        return getElement(surveysPageHeading).getText();
    }
}
