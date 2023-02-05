package tests;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;

public class SearchRankingTest extends BaseTest{




    @BeforeMethod
    public void Login() throws InterruptedException {
        LoginPage.getInstance().Login("lamtt@younetgroup.com", "Lam@12345");
    }

    @Test
    @Description("Kiểm tra việc add keyword có thành công hay không")
    public void addKeywordTest(){
        String keyword = "";
        for (int i = 0; i < 10 ; i++) {
            keyword = "LamTestAutomation" + RandomStringUtils.randomAlphabetic(5);
        }

    }


}
