package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class MultivariateTestPage extends BasePage {
    private By multivariateHeading = By.xpath("//h1[text()='Multivariate Tests']");

    public String verifyMultivariateTestPageHeading(){
        presenceOfElement(multivariateHeading);
        return getElement(multivariateHeading).getText();
    }
}
