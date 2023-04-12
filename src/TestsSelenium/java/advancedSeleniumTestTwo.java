import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

public class advancedSeleniumTestTwo {
    @Test
    public void advancedTestTwo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://demoqa.com/");
        String  currentWindow = driver.getWindowHandle();
        By joinNow = By.cssSelector(".banner-image");
        wait.until(ExpectedConditions.elementToBeClickable(joinNow)).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle:windowHandles){
            if(!currentWindow.equals(windowHandle)){
                driver.switchTo().window(windowHandle);
            }
        } driver.navigate().back();
        driver.navigate().forward();
        driver.switchTo().window(currentWindow);
        driver.navigate().refresh();
        driver.quit();
    }
}
/*1. Launch new Browser
2. Open DemoQA.com website
3. Click on Registration link using
4. Come back to Home page (Use ‘Back’ command)
5. Again go back to Registration page (This time use ‘Forward’ command)
6. Again come back to Home page (This time use ‘To’ command) 7.
Refresh the Browser (Use ‘Refresh’ command)
8. Close the Browser*/