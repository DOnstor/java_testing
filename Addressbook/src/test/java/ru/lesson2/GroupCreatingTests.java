package ru.lesson2;

import org.testng.annotations.Test;

public class GroupCreatingTests extends TestBase {

    @Test
    public void testAB() throws Exception {
        gotoGroupPage();
        initGroupCreating();
        fillGroupForm(new GroupData("Test4", "test2", "test3"));
        submitGroupCreating();
        returnGroupPage();
    }

}
