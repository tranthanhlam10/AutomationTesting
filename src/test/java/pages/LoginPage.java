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
    By inputUsername = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/form/div[1]/div/input");
    By inputPassword = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/form/div[2]/div/input");
    By btnLogin = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/form/div[3]/div/button");

    /**
     * Hàm xử lý các các action test
     * @param user
     * @param pass
     * @return
     * @throws InterruptedException
     */
    public String Login(String user, String pass) throws InterruptedException {


//        driver.findElement(inputUsername).clear();
//        driver.findElement(inputPassword).clear();

        driver.findElement(inputUsername).sendKeys(user);
        driver.findElement(inputPassword).sendKeys(pass);
        driver.findElement(btnLogin).click();
        Thread.sleep(5000);
        return driver.getCurrentUrl();
    }
}
