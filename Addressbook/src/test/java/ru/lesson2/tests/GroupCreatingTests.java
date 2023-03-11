package ru.lesson2.tests;

import org.testng.annotations.Test;
import ru.lesson2.model.GroupData;

public class GroupCreatingTests extends TestBase {

    @Test
    public void testAB() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreating();
        app.getGroupHelper().fillGroupForm(new GroupData("Test6", "test2", "test3"));
        app.getGroupHelper().submitGroupCreating();
        app.getGroupHelper().returnGroupPage();
    }

}
