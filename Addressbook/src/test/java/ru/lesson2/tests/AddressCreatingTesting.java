package ru.lesson2.tests;

import org.testng.annotations.Test;
import ru.lesson2.model.AddData;

public class AddressCreatingTesting extends TestBase{
    @Test
    public void testAddressCreating(){
        app.getNavigationHelper().gotoAddNew();
        app.getAddHelper().fillAddForm(new AddData("Test6", "test2", "test4", "test1", "test2", "test3", "test5", "test1"), true);
        app.getAddHelper().submitAddCreating();
    }
}
