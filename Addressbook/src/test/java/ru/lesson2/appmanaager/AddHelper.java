package ru.lesson2.appmanaager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.lesson2.model.AddData;


public class AddHelper extends HelperBase {

    public AddHelper(WebDriver driver) {
        super(driver);
    }

    public void submitAddCreating() {
        click(By.name("submit"));
    }

    public void fillAddForm(AddData addData, boolean creation) {
        type(By.name("firstname"), addData.firstname());
        type(By.name("middlename"), addData.middlename());
        type(By.name("lastname"), addData.lastname());
        type(By.name("nickname"), addData.nickname());
        type(By.name("title"), addData.title());
        type(By.name("company"), addData.company());
        type(By.name("address"), addData.address());
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(addData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

}


