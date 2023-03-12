package ru.lesson2.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lesson2.model.GroupData;

public class GroupModifTests extends TestBase {
    @Test
    public void tetsGroupModif() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (!app.getGroupHelper().isThereAGroupe()) {
            app.getGroupHelper().createGruop(new GroupData("t1", null, "test3"));
        }
        app.getGroupHelper().selectGroup(before - 1);
        app.getGroupHelper().initGroupModif();
        app.getGroupHelper().fillGroupForm(new GroupData("te1", "test2", "test3"));
        app.getGroupHelper().submitGroupModif();
        app.getGroupHelper().returnGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }
}
