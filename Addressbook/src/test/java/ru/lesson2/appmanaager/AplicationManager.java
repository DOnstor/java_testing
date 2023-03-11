package ru.lesson2.appmanaager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.lesson2.model.GroupData;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class AplicationManager {
    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        //System.setProperty("webdriver.fire.driver", "C:\\xampp\\WebDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        //String baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.id("LoginForm")).submit();
    }

    public void returnGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreating() {
        driver.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.name());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.header());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
        driver.findElement(By.name("group_parent_id")).click();
        driver.findElement(By.name("group_parent_id")).click();
        driver.findElement(By.xpath("//form[@action='/addressbook/group.php']")).click();
    }

    public void initGroupCreating() {
        driver.findElement(By.name("new")).click();
    }

    public void gotoGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public void deleteSelectedGroup() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
