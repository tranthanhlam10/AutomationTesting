package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

import java.io.FileNotFoundException;

public class BaseTest {
    BasePage basePage = new BasePage();

    @BeforeClass
    public void setupTest() throws FileNotFoundException {
        basePage.setDriver();

    }
    @AfterClass
    public void tearDown(){
        basePage.tearDown();
    }
}
