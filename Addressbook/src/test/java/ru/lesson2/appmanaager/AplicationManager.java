package ru.lesson2.appmanaager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import static org.testng.Assert.fail;

public class AplicationManager {
    public WebDriver driver;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private final StringBuffer verificationErrors = new StringBuffer();
    private AddHelper addHelper;
    private final Browser browser;

    public AplicationManager(Browser browser) {

        this.browser = browser;
    }

    public void init() {
        if (browser == Browser.FIREFOX) {
            driver = new FirefoxDriver();
        } else if (browser == Browser.CHROME) {
            driver = new ChromeDriver();
        } else if (browser == Browser.EDGE) {
            driver = new EdgeDriver();
        }
        //driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
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
