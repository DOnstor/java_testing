package ru.lesson2.tests;

import org.testng.annotations.Test;
import ru.lesson2.model.GroupData;

public class GroupModifTests extends TestBase {
    @Test
    public void tetsGroupModif() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModif();
        app.getGroupHelper().fillGroupForm(new GroupData("t1", "test2", "test3"));
        app.getGroupHelper().submitGroupModif();
    }
}
