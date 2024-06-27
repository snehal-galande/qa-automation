package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class FullstackPage extends BasePage{

        private By fullStack = By.xpath("//span[text()='FullStack']");

        public String verifyFullstackButtonOnDashBoard(){
            presenceOfElement(fullStack);
            return getElement(fullStack).getText();
        }

        public void clickOnFullstackButton(){

            clickElement(fullStack);
        }
    }


