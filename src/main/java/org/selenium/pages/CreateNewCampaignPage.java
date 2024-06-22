package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class CreateNewCampaignPage extends BasePage {
    private By campaignName = By.id("new-campaign-name");
    private By platForm = By.xpath("//span[text()='Website']");
    private By campaignType = By.xpath("//span[text()='Split URL Test']");
    private By createButton = By.xpath("//button[text()=' Create ']");

    public String createNewCampaign(){
         presenceOfElement(campaignName);
         return getElement(campaignName).getText();
    }
    public void clickOnPlatform(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickElement(platForm);
    }
    public void clickOnCampaignType(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickElement(campaignType);
    }
    public void clickOnCreateButton(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickElement(createButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
