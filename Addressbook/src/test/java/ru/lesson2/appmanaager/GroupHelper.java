package ru.lesson2.appmanaager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.lesson2.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreating() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.name());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.header());
        type(By.name("group_footer"), groupData.footer());
        click(By.xpath("//form[@action='/addressbook/group.php']"));
    }

    public void initGroupCreating() {
        click(By.name("new"));
    }


    public void deleteSelectedGroup() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModif() {
        click(By.name("edit"));

    }

    public void submitGroupModif() {
        click(By.name("update"));
    }
}
