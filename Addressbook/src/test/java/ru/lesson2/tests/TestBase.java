package ru.lesson2.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.lesson2.appmanaager.AplicationManager;

public class TestBase {
    protected final AplicationManager app = new AplicationManager(Browser.CHROME);

    @BeforeClass(alwaysRun = true)

    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
