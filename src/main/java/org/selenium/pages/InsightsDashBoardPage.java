package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class InsightsDashBoardPage extends BasePage {
         private By dashBoardHeading = By.xpath("//h1[text()='Dashboard']");

         public String verifyDashBoardHeading(){
             presenceOfElement(dashBoardHeading);
             return getElement(dashBoardHeading).getText();
         }
}
