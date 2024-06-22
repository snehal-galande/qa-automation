package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class HeatmapsPage extends BasePage {
    private By heatMapsHeading = By.xpath("//h1/span[text()='Heatmaps']");
    private By startDemoButton = By.xpath("//button/span[text()='Start demo']");

    public String verifyHeatmapsHeading(){
        presenceOfElement(heatMapsHeading);
        return getElement(heatMapsHeading).getText();
    }

    public void clickOn() {
        clickElement(startDemoButton);
    }
}
