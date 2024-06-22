package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.base.BasePage;
import org.selenium.utils.PropertyReader;

public class LoginPage extends BasePage {
    private By userName = By.id("login-username");
    private By passWord = By.id("login-password");
    private By button = By.xpath("//button[@id='js-login-btn']");
    //5.expath of error msg
    private By errorMsgId = By.id("js-notification-box-msg");

    public LoginPage loginToVWO() {

        //Map<String, String> stringMap = PropertyReader.fileReader();
//        String userName = stringMap.get("username");
//        String password = stringMap.get("password");
        // Using manual Property reader call method
//        enterInput(By.id("login-username"), stringMap.get("username"));
//        enterInput(By.id("login-password"), stringMap.get("password"));

        //using Proprty readKey Method
        // Get the value of the text field
        WebElement element = getElement(userName);
        String fieldValue = element.getAttribute("value");

        // Check if the text field already has a value
        if (!fieldValue.isEmpty()) {
            System.out.println("Text field already has a value: " + fieldValue);
            element.clear();
        } else {
            System.out.println("Text field is empty");
        }

        enterInput(userName, PropertyReader.readKey("username"));
        enterInput(passWord, PropertyReader.readKey("password"));
        clickElement(button);

        return this;
    }

    public LoginPage invalidLoginToVWO() throws InterruptedException {

        //2. enter the invalid username into the  text box
        enterInput(userName,PropertyReader.readKey("invalid_username"));
        //3. enter the password into the text box
        enterInput(passWord,PropertyReader.readKey("password"));
        //4.click on sign in button
        clickElement(button);
        Thread.sleep(2000);
//        implicitWait();
        return this;
    }

    public  String invalidErrorMsg(){
      //1.take error msg id

        return getMsg(errorMsgId);
    }
    public DashboardPage afterLogin(){

        return new DashboardPage();
    }
}
