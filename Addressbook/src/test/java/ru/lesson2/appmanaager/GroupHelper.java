package ru.lesson2.appmanaager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.lesson2.model.GroupData;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
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

    public void deleteSelectedGroup() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
