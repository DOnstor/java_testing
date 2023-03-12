package ru.lesson2.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lesson2.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (!app.getGroupHelper().isThereAGroupe()) {
            app.getGroupHelper().createGruop(new GroupData(null, null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before-1);
    }

}
