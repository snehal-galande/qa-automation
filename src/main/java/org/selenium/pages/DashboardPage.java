package org.selenium.pages;


import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class DashboardPage extends BasePage {
      DashboardPage(){

      }
      By userNameOnDashboard = By.xpath("//span[@data-qa=\"lufexuloga\"]");
      By createTestButton = By.xpath("//a[text()=' Create Test ']");

      public String loggedInUserName(){
          presenceOfElement(userNameOnDashboard);
          return getElement(userNameOnDashboard).getText();
      }

    public TestingPage dashBoardToTesting() {
          return new TestingPage();
    }

    public InsightsPage dashBoardToInsights(){

          return new InsightsPage();
    }

    public FullstackPage dashBoardToFullStack(){
          return new FullstackPage();
    }

    public String verifyCreateTestButton(){
          presenceOfElement(createTestButton);
          return getElement(createTestButton).getText();
    }

    public void clickOnCreateTestButton(){
          clickElement(createTestButton);
    }
}