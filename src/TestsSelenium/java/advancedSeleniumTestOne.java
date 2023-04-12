import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class advancedSeleniumTestOne {
    @Test
    public void advancedTestOne(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String urlPage = "https://shop.demoqa.com/";
        driver.get(urlPage);
        String title = driver.getTitle();
        int titleLength = title.length();
        System.out.println(title+" "+titleLength);
        String pageURL = driver.getCurrentUrl();
        Assert.assertEquals(pageURL,urlPage);
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println(pageSourceLength);
        driver.quit();
    }
}
/*1. Launch a new Chrome browser.
2. Open Shop.DemoQA.com
3. Get Page Title name and Title length
4. Print Page Title and Title length on the Eclipse Console.
5. Get Page URL and verify if it is a correct page opened
6. Get Page Source (HTML Source code) and Page Source length
7. Print Page Length.
8. Close the Browser.*/