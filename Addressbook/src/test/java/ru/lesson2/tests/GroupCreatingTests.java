package ru.lesson2.tests;

import org.testng.annotations.Test;
import ru.lesson2.model.GroupData;

public class GroupCreatingTests extends TestBase {

    @Test
    public void testAB() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGruop(new GroupData(null, null, null));
    }

}
