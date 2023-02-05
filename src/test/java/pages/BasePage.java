package pages;

import drivermanager.BDriverFactory;
import org.openqa.selenium.WebDriver;
import utils.PropertiesFileReader;

import java.time.Duration;

public class BasePage {
      public static WebDriver driver;

    /**
     * Hàm setup driver, test trang nào chỉ cần dán link trang đó vào
     * Ở đây demo nên tui lấy 1 trang sample
     */
    public void setDriver(){
//        driver = BDriverFactory.InitDriver(System.getProperty("driver"));
          driver = BDriverFactory.InitDriver("chrome");
          driver.manage().window().maximize();
          driver.navigate().to("https://eca-tool-testing.younetmedia.com/auth/login");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      }
      public void tearDown(){
          driver.quit();
      }

    /**
     * Hàm đọc file properties, có khi lại cần sử dụng đến
     */
    public void setupPropertiesFile(){
          PropertiesFileReader.setPropertiesFile();
     }
}
