package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.base.BasePage;

public class InsightsPage extends BasePage {
          private By insightsButton = By.xpath("//span[text()='Insights']");
          private By insiteDropDownButton = By.xpath("//span[text()='Insights']/../../button");
          private By dashBoardButton = By.xpath("//span[text()='Insights']/../../ul//li/a//span[text()='Dashboard']");
          private By goalsButton = By.xpath("//span[text()='Insights']/../..//ul/li/a//span[text()='Goals']");
          private By funnelsButton = By.xpath("//span[text()='Insights']/../..//ul/li/a//span[text()='Funnels']");
          private By heatMapsButton = By.xpath("//span[text()='Insights']/../../ul/li/a//span[text()='Heatmaps']");
          private By sessionRecordingsButton = By.xpath("//span[text()='Insights']/../../ul/li/a//span[text()='Session Recordings']");
          private By mobileSessionRecordingsButton = By.xpath("//span[text()='Insights']/../../ul/li/a//span[text()='Mobile Recordings']");
          private By formsButton = By.xpath("//span[text()='Insights']/../../ul/li/a//span[text()='Forms']");
          private By surveysButton = By.xpath("//span[text()='Insights']/../../ul/li/a//span[text()='Surveys']");
          private By popupCloseButton = By.xpath("//button[@vwo-title = 'Close']");
          private By insightsDashboardPopupHeading = By.xpath("//h4[text()='Insights Dashboard']");

          public String verifyInsightsButtonOnDashboard(){
              implicitWait();
              presenceOfElement(insightsButton);
              return getElement(insightsButton).getText();
          }

          public void clickOnInsightsButton(){
              implicitWait();
              WebElement element = getElement(insiteDropDownButton);
              String classAttribute = element.getAttribute("class");
              if (classAttribute.contains("collapsed"))
                  clickElement(insiteDropDownButton);
          }

          public String verifyDashboardButtonInInsightsOption(){
              implicitWait();
              presenceOfElement(dashBoardButton);
              return getElement(dashBoardButton).getText();
          }
          public void clickOnDashBoardOption(){
              try {
                  Thread.sleep(5000);
                  clickElement(dashBoardButton);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }

          }

          public String verifyGoalsButtonOnDashboard(){
              implicitWait();
              presenceOfElement(goalsButton);
              return getElement(goalsButton).getText();
          }
          public void clickOnGoalsButton(){
              implicitWait();
              clickElement(goalsButton);

          }

          public String verifyFunnelsButtonOndashboard(){
              implicitWait();
              presenceOfElement(funnelsButton);
              return getElement(funnelsButton).getText();
          }

          public void clickOnFunnelsButton(){
              implicitWait();
              clickElement(funnelsButton);
          }

          public String verifyHeatmapsButtonOnDashboard(){
              implicitWait();
              presenceOfElement(heatMapsButton);
              return getElement(heatMapsButton).getText();
          }

          public void clickOnHeatMapsButton(){
              implicitWait();
              clickElement(heatMapsButton);

          }

          public String verifySessionRecordingsButton(){
              presenceOfElement(sessionRecordingsButton);
              return getElement(sessionRecordingsButton).getText();
          }

          public void clickOnSessionRecordingsButton(){
              clickElement(sessionRecordingsButton);
          }

          public String verifyMobileReccordingButton(){
              presenceOfElement(mobileSessionRecordingsButton);
              return getElement(mobileSessionRecordingsButton).getText();
          }
          public void clickOnMobileRecordings(){
              clickElement(mobileSessionRecordingsButton);
          }

          public String verifyFormsButton(){
              presenceOfElement(formsButton);
              return getElement(formsButton).getText();
          }

          public void clickOnFormsButton(){
              clickElement(formsButton);
          }

          public String verifySurveyButton(){
              presenceOfElement(surveysButton);
              return getElement(surveysButton).getText();
          }

          public void clickOnSurveyButton(){

              clickElement(surveysButton);
          }

          public void closePopUp(){
              WebElement element = presenceOfElement(insightsDashboardPopupHeading);
              if(element.isDisplayed()){
                  clickElement(popupCloseButton);
              }
          }
}


