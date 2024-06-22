package org.selenium.web.tests;

import org.assertj.core.api.Assertions;
import org.selenium.pages.*;
import org.selenium.web.testbase.TestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;



public class InsightsPageTest extends TestBase {
    Logger logger = LoggerFactory.getLogger(InsightsPage.class);

    @Test
    public void test_DashBoardOptionPage(){
//         DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//         DriverManagerTL.getWebDriver().manage().window().maximize();
         DashboardPage dashboardPage = new LoginPage().afterLogin();
         InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
         String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
         Assertions.assertThat(insightsButton).isNotBlank().isNotNull().contains("Insights");
        logger.info("Insight Button is present on dahsboard {}", insightsButton);
         insightsPage.clickOnInsightsButton();

         String dashBoardButton = insightsPage.verifyDashboardButtonInInsightsOption();
         Assertions.assertThat(dashBoardButton).isNotNull().isNotBlank().contains("Dashboard");
        logger.info("Dashboard button is present on {}", dashBoardButton);
        insightsPage.clickOnDashBoardOption();
        logger.info("Click on {} button", dashBoardButton);
        
        insightsPage.closePopUp();
         String dashBoardHeading = new InsightsDashBoardPage().verifyDashBoardHeading();
         Assertions.assertThat(dashBoardHeading).isNotBlank().isNotNull().contains("Dashboard");
         logger.info("Dashboard heading {} is present on Dashboard page", dashBoardHeading);

    }

    @Test
    public void test_GoalsOptionPage(){
//        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
        String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
        Assertions.assertThat(insightsButton).isNotNull().isNotBlank().contains("Insights");
        System.out.println("Insight Button is present " + insightsButton);
        insightsPage.clickOnInsightsButton();

        String goalsButton = insightsPage.verifyGoalsButtonOnDashboard();
        Assertions.assertThat(goalsButton).isNotBlank().isNotNull().contains("Goals");
        insightsPage.clickOnGoalsButton();

        String goalsHeading = new GoalsPage().verifyGoalsPageHeading();
        Assertions.assertThat(goalsHeading).isNotNull().isNotBlank().contains("Goals");
        System.out.println(goalsHeading);
    }

    @Test
    public void test_FunnelsOptionPage(){
//        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
        String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
        Assertions.assertThat(insightsButton).isNotNull().isNotBlank().contains("Insights");
        System.out.println("Insight Button is present " + insightsButton);
        insightsPage.clickOnInsightsButton();

        String funnelsButton = insightsPage.verifyFunnelsButtonOndashboard();
        Assertions.assertThat(funnelsButton).isNotNull().isNotBlank().contains("Funnels");
        insightsPage.clickOnFunnelsButton();
        String funnelsPageHeading = new FunnelsPage().verifyFunnelsPageHeading();
        Assertions.assertThat(funnelsPageHeading).isNotNull().isNotBlank().contains("Funnels");
        System.out.println(funnelsPageHeading);
    }

    @Test
    public void test_HeatmapsPage() throws InterruptedException {
//        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
        String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
        Assertions.assertThat(insightsButton).isNotNull().isNotBlank().contains("Insights");
        System.out.println("Insight Button is present " + insightsButton);
        insightsPage.clickOnInsightsButton();

        String heatMapsButton = insightsPage.verifyHeatmapsButtonOnDashboard();
        Assertions.assertThat(heatMapsButton).isNotBlank().isNotNull().contains("Heatmaps");
        System.out.println(heatMapsButton + " Button is present on dashboard " );
        insightsPage.clickOnHeatMapsButton();
        Thread.sleep(5000);
        String heatMapsHeading = new HeatmapsPage().verifyHeatmapsHeading();
        Assertions.assertThat(heatMapsHeading).isNotNull().isNotBlank().contains("Heatmaps");
        System.out.println(heatMapsHeading);
    }

    @Test
    public void test_SessionRecordingsPage(){
//        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
        String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
        Assertions.assertThat(insightsButton).isNotNull().isNotBlank().contains("Insights");
        insightsPage.clickOnInsightsButton();

        String sessionRecordingsButton = insightsPage.verifySessionRecordingsButton();
        Assertions.assertThat(sessionRecordingsButton).isNotBlank().isNotNull().contains("Session Recordings");
        insightsPage.clickOnSessionRecordingsButton();
        String sessionRecordingHeading = new SessionRecordingsPage().verifySessionRecordingsHeading();
        Assertions.assertThat(sessionRecordingHeading).isNotNull().isNotBlank().contains("Session Recordings");
        System.out.println(sessionRecordingHeading);
    }

    @Test
    public void test_MobileRecordingsPage(){
//        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
        String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
        Assertions.assertThat(insightsButton).isNotNull().isNotBlank().contains("Insights");
        insightsPage.clickOnInsightsButton();

        String mobileRecordingsButton = insightsPage.verifyMobileReccordingButton();
        Assertions.assertThat(mobileRecordingsButton).isNotBlank().isNotNull().contains("Mobile Recordings");
        insightsPage.clickOnMobileRecordings();
        String mobileSessionRecordingsHeading = new MobileSessionRecordingsPage().verifyMobileSessionRecordingsHeading();
        Assertions.assertThat(mobileSessionRecordingsHeading).isNotNull().isNotBlank().contains("Mobile Session Recordings");
        System.out.println(mobileSessionRecordingsHeading);
    }

    @Test
    public void test_FormsPage(){
//        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
        String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
        Assertions.assertThat(insightsButton).isNotNull().isNotBlank().contains("Insights");
        insightsPage.clickOnInsightsButton();

        String formsButton = insightsPage.verifyFormsButton();
        Assertions.assertThat(formsButton).isNotBlank().isNotNull().contains("Forms");
        insightsPage.clickOnFormsButton();
        String formsHeading = new FormsPage().verifyFormsHeading();
        Assertions.assertThat(formsHeading).isNotNull().isNotBlank().contains("Form Analytics");
        System.out.println(formsHeading);
    }

    @Test
    public void test_SurveysPage(){
//        DriverManagerTL.getWebDriver().get(PropertyReader.readKey("url"));
//        DriverManagerTL.getWebDriver().manage().window().maximize();
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        InsightsPage insightsPage = dashboardPage.dashBoardToInsights();
        String insightsButton = insightsPage.verifyInsightsButtonOnDashboard();
        Assertions.assertThat(insightsButton).isNotNull().isNotBlank().contains("Insights");
        insightsPage.clickOnInsightsButton();

        String surveyButton = insightsPage.verifySurveyButton();
        Assertions.assertThat(surveyButton).isNotBlank().isNotNull().contains("Surveys");
        insightsPage.clickOnSurveyButton();
        String surveyHeading = new SurveysPage().verifySurveysHeading();
        Assertions.assertThat(surveyHeading).isNotNull().isNotBlank().contains("On-page Surveys");
        System.out.println(surveyHeading);
    }
}
