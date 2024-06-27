package org.selenium.web.tests;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.selenium.pages.DashboardPage;
import org.selenium.pages.FullstackPage;
import org.selenium.pages.InsightsPage;
import org.selenium.pages.LoginPage;
import org.selenium.web.testbase.TestBase;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.logging.Logger;
@Slf4j
public class FullstackPageTest extends TestBase {

    @Test
    public void test_FullstackpageTest(){
        DashboardPage dashboardPage = new LoginPage().afterLogin();
        FullstackPage fullstackPage = dashboardPage.dashBoardToFullStack();
        String fullStackButton = fullstackPage.verifyFullstackButtonOnDashBoard();
        Assertions.assertThat(fullStackButton).isNotBlank().isNotNull().contains("FullStack");
        log.info("Fullstack button is present on dashboard{}",fullStackButton);
        fullstackPage.clickOnFullstackButton();
    }

}
