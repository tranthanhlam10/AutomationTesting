package pages;

import drivermanager.BDriverFactory;
import org.openqa.selenium.WebDriver;
import utils.PropertiesFileReader;
import utils.TextFileReader;

import java.io.FileNotFoundException;
import java.time.Duration;

public class BasePage {
      public static WebDriver driver;
      public static string settingFilePath = "src/test/resources/config.txt";

 
    public void setDriver() throws FileNotFoundException {

          TextFileReader fileReader = new TextFileReader();
          fileReader.setFile_path(settingFilePath);

          String  env = (System.getProperty("env") == null) ? "testing" :System.getProperty("env");
          driver = BDriverFactory.InitDriver(fileReader.readTextFile(fileReader.getFile_path()));

          // Cần phải improve chỗ này, lỗi khi không thể set 2 properties cho Maven. Mai fix.
          driver.manage().window().maximize();
          driver.navigate().to("https://eca-tool-"+env+".younetmedia.com/auth/login");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      }
      public void tearDown(){
          driver.quit();
      }

    
    public void setupPropertiesFile(){
          PropertiesFileReader.setPropertiesFile();
     }
}
