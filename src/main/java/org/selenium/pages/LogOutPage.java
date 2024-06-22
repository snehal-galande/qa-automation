package org.selenium.pages;

import org.openqa.selenium.By;
import org.selenium.base.BasePage;

public class LogOutPage extends BasePage {
    private By userMenu = By.xpath("//img[@data-qa='user-image']");
    private By logOutButton = By.xpath("//li[text()='Logout']");

    public LogOutPage logOutFromUser() {


        try {
            clickElement(userMenu);
            Thread.sleep(5000);
            clickElement(logOutButton);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }


        return this;
    }
}
