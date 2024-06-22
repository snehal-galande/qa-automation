package org.selenium.web.tests;

import org.assertj.core.api.Assertions;
import org.selenium.driver.DriverManagerTL;
import org.selenium.pages.*;
import org.selenium.utils.PropertyReader;
import org.selenium.web.testbase.TestBase;
import org.testng.annotations.Test;

public class TestingPageTest extends TestBase {
//          @Test
//          public void test_TestingPage()  {
////              DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
////              DriverManagerTL.getWebDriver().manage().window().maximize();
//              DashboardPage dashboardPage = new LoginPage().afterLogin();
//              TestingPage testingPage = dashboardPage.dashBoardToTesting();
//              String testingButton = testingPage.verifyTestingOptionOnDashboard(); //"Testing"
//              Assertions.assertThat(testingButton).isNotBlank().isNotNull().contains("Testing");
//              //if above condition is true then click on testing button
//              testingPage.clickOnTestingButton();
//          }

          @Test
          public void test_ABPage() {
//              DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//              DriverManagerTL.getWebDriver().manage().window().maximize();
              DashboardPage dashboardPage = new LoginPage().afterLogin();
              TestingPage testingPage = dashboardPage.dashBoardToTesting();
              String testingButton = testingPage.verifyTestingOptionOnDashboard(); //"Testing"
              Assertions.assertThat(testingButton).isNotBlank().isNotNull().contains("Testing");
              //it goes to dashbaord page and click on testing option
              testingPage.clickOnTestingButton();
              //verify ab option under testing option
              String abButton = testingPage.verifyABButtonPresentInTestingOption();
              Assertions.assertThat(abButton).isNotNull().isNotBlank().contains("A/B");
              testingPage.clickOnABButton();
              // move to ab page
              ABPage abPage = testingPage.testingToABPage();
              String abPageHeading = abPage.verifyABPageHeading();
              Assertions.assertThat(abPageHeading).isNotNull().isNotBlank().contains("A/B Tests");
              System.out.println(abPageHeading);
          }

          @Test
          public void test_MultivariatePage()  {
              DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
              DriverManagerTL.getWebDriver().manage().window().maximize();
              DashboardPage dashboardPage = new LoginPage().loginToVWO().afterLogin();
              TestingPage testingPage = dashboardPage.dashBoardToTesting();
              String testingButton = testingPage.verifyTestingOptionOnDashboard(); //"Testing"
              Assertions.assertThat(testingButton).isNotBlank().isNotNull().contains("Testing");
              testingPage.clickOnTestingButton();
              String MultivariateButton = testingPage.verifyMultivaiateButtonOnDashbaord();
              Assertions.assertThat(MultivariateButton).isNotNull().isNotBlank().contains("Multivariate");
              testingPage.clickOnMultivariateButton();

              MultivariateTestPage multivariatePage = testingPage.testingToMultivariatePage();
              String multivariatePageHeading = multivariatePage.verifyMultivariateTestPageHeading();

              Assertions.assertThat(multivariatePageHeading).isNotBlank().isNotNull().contains("Multivariate Tests");
              System.out.println(multivariatePageHeading);

          }

          @Test
          public void test_SplitURLPage(){
              DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
              DriverManagerTL.getWebDriver().manage().window().maximize();
              DashboardPage dashboardPage = new LoginPage().loginToVWO().afterLogin();
              TestingPage testingPage = dashboardPage.dashBoardToTesting();
              String testingButton = testingPage.verifyTestingOptionOnDashboard();
              Assertions.assertThat(testingButton).isNotBlank().isNotBlank().contains("Testing");
              testingPage.clickOnTestingButton();

              String splitURLButton = testingPage.verifySplitURLButtonOnDashboard();
              Assertions.assertThat(splitURLButton).isNotNull().isNotBlank().contains("Split URL");
              testingPage.clickOnSplitURLButton();

              SplitURLTestPage splitURLTestPage = testingPage.testingToSplitURLPage();
              String splitURLHeading = splitURLTestPage.verifySplitURLTestPageHeading();
              Assertions.assertThat(splitURLHeading).isNotBlank().isNotNull().contains("Split URL Tests");
              System.out.println(splitURLHeading);
          }

          @Test
          public void test_MobileAppAbPage(){
              DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
              DriverManagerTL.getWebDriver().manage().window().maximize();
              DashboardPage dashboardPage = new LoginPage().loginToVWO().afterLogin();
              TestingPage testingPage = dashboardPage.dashBoardToTesting();
              String testingButton = testingPage.verifyTestingOptionOnDashboard();
              Assertions.assertThat(testingButton).isNotBlank().isNotNull().contains("Testing");
              testingPage.clickOnTestingButton();

              String mobileAppAbButton = testingPage.verifyMobileAppAbbuttonOnDashbaord();
              Assertions.assertThat(mobileAppAbButton).isNotNull().isNotBlank().contains("Mobile App A/B");
              testingPage.clickOnMobileAppAbButton();

              MobileAppABTestPage mobileAppABTestPage = testingPage.testingToMobileAppAbButtonOnDashboard();
              String mobileAppAbHeading = mobileAppABTestPage.verifyMobileAppAbTestPageHeading();
              Assertions.assertThat(mobileAppAbHeading).isNotBlank().isNotNull().contains("Mobile App A/B Tests");
              System.out.println(mobileAppAbHeading);
          }
}
