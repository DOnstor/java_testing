package ru.lesson2.tests;

import org.testng.annotations.Test;
import ru.lesson2.model.GroupData;

public class GroupCreatingTests extends TestBase {

    @Test
    public void testAB() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreating();
        app.fillGroupForm(new GroupData("Test4", "test2", "test3"));
        app.submitGroupCreating();
        app.returnGroupPage();
    }

}
