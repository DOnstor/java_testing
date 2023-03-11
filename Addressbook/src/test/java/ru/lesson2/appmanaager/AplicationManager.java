package ru.lesson2.appmanaager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class AplicationManager {
    public WebDriver driver;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private final boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private AddHelper addHelper;

    public void init() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        addHelper = new AddHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        SessionHelper sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public AddHelper getAddHelper() {
        return addHelper;
    }
}
