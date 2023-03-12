package ru.lesson2.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lesson2.model.GroupData;

public class GroupCreatingTests extends TestBase {

    @Test
    public void testAB() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGruop(new GroupData(null, null, null));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before+1);
    }

}
