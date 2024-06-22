  package org.selenium.driver;

  import org.openqa.selenium.PageLoadStrategy;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.chrome.ChromeOptions;
  import org.selenium.pages.LogOutPage;
  import org.selenium.pages.LoginPage;
  import org.selenium.utils.PropertyReader;
  import org.testng.annotations.AfterClass;
  import org.testng.annotations.AfterMethod;
  import org.testng.annotations.BeforeMethod;
  import org.testng.annotations.BeforeSuite;

  import java.net.MalformedURLException;

  public class DriverManagerTL {

      static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();

      public static WebDriver getWebDriver(){


          return dr.get();
      }

      public static void driverUnLoad(){

          dr.remove();
      }

      @BeforeSuite
      public static void init() throws MalformedURLException {
          if(getWebDriver() == null) {
              ChromeOptions options = new ChromeOptions();
              options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
              //driver = new ChromeDriver(options);
              //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
//             driver.manage().window().maximize();
              ChromeDriver chromeDriver = new ChromeDriver(options);
              chromeDriver.get(PropertyReader.readKey("url"));
              chromeDriver.manage().window().maximize();
              dr.set(chromeDriver);
          }
      }

      @BeforeMethod
      public static void login() {

          new LoginPage().loginToVWO();
      }

      @AfterMethod
      public static void logout() {

          LogOutPage logOutPage = new LogOutPage();
          logOutPage.logOutFromUser();
      }

      @AfterClass
      public static void tearDown() {
          WebDriver driver = getWebDriver();
          if (driver != null) {
              driver.quit();
              dr.remove();
          }
      }
}
