package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

public class BaseTest {
    BasePage basePage = new BasePage();

    @BeforeClass
    public void setupTest(){
        basePage.setDriver();

    }
    @AfterClass
    public void tearDown(){
        basePage.tearDown();
    }
}
