package org.selenium.web.tests;

import org.assertj.core.api.Assertions;
import org.selenium.pages.CreateNewCampaignPage;
import org.selenium.pages.DashboardPage;
import org.selenium.pages.LoginPage;
import org.selenium.web.testbase.TestBase;
import org.testng.annotations.Test;

public class DashBoardPageTest extends TestBase {
       @Test
    public void test_DashBoardPage(){
//           DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//           DriverManagerTL.getWebDriver().manage().window().maximize();
           DashboardPage dashboardPage = new LoginPage().afterLogin();
           String createTestButton = dashboardPage.verifyCreateTestButton();
           Assertions.assertThat(createTestButton).isNotNull().isNotBlank().contains("Create Test");
           dashboardPage.clickOnCreateTestButton();
           System.out.println("Create test button is present");

           CreateNewCampaignPage createNewCampaignPage = new CreateNewCampaignPage();
           createNewCampaignPage.clickOnPlatform();
           createNewCampaignPage.clickOnCampaignType();
           createNewCampaignPage.clickOnCreateButton();

       }
}
