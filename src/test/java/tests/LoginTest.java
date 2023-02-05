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
        Assert.assertEquals(LoginPage.getInstance().Login("lamtt@younetgroup.com", "Lam@12345") , "https://eca-tool-testing.younetmedia.com/products" );
    }
}
