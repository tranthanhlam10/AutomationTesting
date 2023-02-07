package pages;

import org.openqa.selenium.By;

public class SearchRankingPage extends BasePage{

    // Lay cac element cua man hinh search ranking.
    // Man hinh search ranking dashboard.

    By search_ranking_menu = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/ul/li[5]/a");
    By keyword_config_btn = By.xpath("//*[@id=\"DASHBOARD_LAYOUT_MAIN\"]/nav/div[2]/button");
    By keyword_add_btn = By.xpath("//*[@id=\"DASHBOARD_LAYOUT_MAIN\"]/div[4]/div[2]/button");
    By popup_add_keyword = By.xpath("/html/body/div[9]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/textarea");




    public void navigateKeywordSetingScreen() throws InterruptedException {
        driver.findElement(search_ranking_menu).click();
        Thread.sleep(2000);
        driver.findElement(keyword_config_btn).click();
    }

    public void addNewKeyword(String keyword) throws InterruptedException {
        navigateKeywordSetingScreen();
        driver.findElement(keyword_add_btn).click();
        Thread.sleep(500);
        driver.findElement(popup_add_keyword).sendKeys(keyword);
    }

    // Hiện tại đang pending lại hàm này, để tối test tiếp.
    public void checkNumberOfKeyword(){

    }
}
