package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchRankingPage extends BasePage{

    // Lay cac element cua man hinh search ranking.
    // Man hinh search ranking dashboard.

    By search_ranking_menu = By.cssSelector("#app > div > div.app > div > div > div.scrollbar-container.sidebar-nav > ul > li:nth-child(4)");
    By keyword_config_btn = By.xpath("//*[@id=\"DASHBOARD_LAYOUT_MAIN\"]/nav/div[2]/button");
    By keyword_add_btn = By.xpath("//*[@id=\"DASHBOARD_LAYOUT_MAIN\"]/div[4]/div[2]/button");
    By popup_add_keyword = By.xpath("/html/body/div[9]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/textarea");
    By keyword_crawling_update_btn = By.xpath("//*[@id=\"DASHBOARD_LAYOUT_MAIN\"]/div[2]/div[2]/button[2]");
    By popup_confirm_crawling_btn = By.xpath("//*[@id=\"myAlert\"]/div/div[3]/button[2]");

    private static SearchRankingPage _instance;

    private SearchRankingPage(){}


    // Sử dụng DP Singleton -> Chỉ tạo 1 instance của class này.
    public static SearchRankingPage getInstance(){
        if(_instance == null)
            _instance = new SearchRankingPage();
        return _instance;
    }

    public void navigateKeywordSetingScreen() throws InterruptedException {
        driver.findElement(search_ranking_menu).click();
        driver.navigate().to("https://eca-tool-testing.younetmedia.com/search-ranking/dashboard?id_source=shopee.vn");
        Thread.sleep(2000);
        driver.findElement(keyword_config_btn).click();
    }

    public void addNewKeyword(String keyword) throws InterruptedException {
        driver.findElement(keyword_add_btn).click();
        Thread.sleep(500);
        driver.findElement(popup_add_keyword).sendKeys(keyword);
        driver.findElement(keyword_crawling_update_btn).click();
        Thread.sleep(1000);
        driver.findElement(popup_confirm_crawling_btn);
    }

    public int checkNumberOfKeyword(){
            // tim tong so hang, ham find elements nay tra vef cac locator co dai chi xpath giong nhau
            List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"DASHBOARD_LAYOUT_MAIN\"]/div[5]/div/div[1]/table/tbody/tr"));
            System.out.println(row.size());
            return + row.size();
    }
}
