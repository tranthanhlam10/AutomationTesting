package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{


    /**
     * Kiểm tra xem test case đã đúng hay chưa
     * Sử dụng Allure report library để generate report.
     * @throws InterruptedException
     */
    @Test(priority = 1 , description = "Login check")
    @Description("Kiểm tra đăng nhập với tài khoản chính xác")
    public void testLogin() throws InterruptedException {
        Assert.assertEquals(LoginPage.getInstance().Login("admin@demo.com", "riseDemo") , "https://rise.fairsketch.com/dashboard" );
    }
}
