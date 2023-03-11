package ru.lesson2.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class zAdT extends TestBase{
   /* private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        GroupHelper GroupHelper = new GroupHelper(driver);
        NavigationHelper navigationHelper = new NavigationHelper(driver);
        SessionHelper sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }
*/
    @Test
    public void testAddTests() throws Exception {
        app.getNavigationHelper().gotoAddNew();
        app.driver.findElement(By.name("firstname")).click();
              app.driver.findElement(By.name("firstname")).clear();


        app.driver.findElement(By.name("firstname")).sendKeys("x");
        app.driver.findElement(By.name("middlename")).click();
        app. driver.findElement(By.name("middlename")).clear();
        app. driver.findElement(By.name("middlename")).sendKeys("xzv");
        app. driver.findElement(By.name("lastname")).click();
        app. driver.findElement(By.name("lastname")).clear();
        app. driver.findElement(By.name("lastname")).sendKeys("xvz");
        app. driver.findElement(By.name("nickname")).click();
        app. driver.findElement(By.name("nickname")).clear();
        app. driver.findElement(By.name("nickname")).sendKeys("vxz");
        app. driver.findElement(By.name("company")).click();
        app. driver.findElement(By.name("company")).clear();
        app.  driver.findElement(By.name("company")).sendKeys("x");
        app.  driver.findElement(By.name("title")).click();
        app.  driver.findElement(By.name("title")).clear();
        app.   driver.findElement(By.name("title")).sendKeys("v");
        app.   driver.findElement(By.name("address")).click();
        app.  driver.findElement(By.name("address")).clear();
        app.   driver.findElement(By.name("address")).sendKeys("x");
        app.   driver.findElement(By.name("submit")).click();
    }

}
