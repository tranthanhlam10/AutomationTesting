package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import pages.SearchRankingPage;

public class SearchRankingTest extends BaseTest{

    @BeforeMethod
    public void Login() throws InterruptedException {
        LoginPage.getInstance().Login("lamtt15@gmail.com", "Lam@12345");
    }

    // Kết luận là search ranking không thể test automation được, quá khó để xây dựng kịch bản test.
    // Nghiên cứu cách chỉ cần đăng nhập 1 lần để test hết tất cả các chức năng trong 1 web
    @Test
    @Description("Kiểm tra việc add keyword có thành công hay không")
    public void addKeywordTest() throws InterruptedException {
        String keyword = "";
        for (int i = 0; i < 10 ; i++) {
            keyword = "LamTestAutomation" + RandomStringUtils.randomAlphabetic(10);
        }
        SearchRankingPage.getInstance().addNewKeyword(keyword);

        Assert.assertEquals(keyword, SearchRankingPage.getInstance().checkNumberOfKeyword());

    }

}
