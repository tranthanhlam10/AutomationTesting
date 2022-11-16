package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private static LoginPage _instance;

    private LoginPage(){}


    // Sử dụng DP Singleton -> Chỉ tạo 1 instance của class này.
    public static LoginPage getInstance(){
        if(_instance == null)
            _instance = new LoginPage();
        return _instance;
    }


    /**
     * Lấy các locator
     * Ở dây lấy locator của 3 element: Email, Password, Button Đăng nhập
     */
    By inputUsername = By.xpath("//*[@id='email']");
    By inputPassword = By.xpath("//*[@id='password']");
    By btnLogin = By.xpath("//*[@id='signin-form']/button");

    /**
     * Hàm xử lý các các action test
     * @param user
     * @param pass
     * @return
     * @throws InterruptedException
     */
    public String Login(String user, String pass) throws InterruptedException {


        driver.findElement(inputUsername).clear();
        driver.findElement(inputPassword).clear();

        driver.findElement(inputUsername).sendKeys(user);
        driver.findElement(inputPassword).sendKeys(pass);
        driver.findElement(btnLogin).click();
        Thread.sleep(3000);
        return driver.getCurrentUrl();
    }
}
