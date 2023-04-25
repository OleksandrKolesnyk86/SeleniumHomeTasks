import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class advancedSeleniumTestThree {
    @Test
    public void advancedTestFour(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://demoqa.com/progress-bar");
        By start = By.cssSelector("#startStopButton");
        driver.findElement(start).click();
        By reset = By.cssSelector("#resetButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(reset)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(start)).click();
        driver.quit();
    }
}
/*1. Launch new Browser
2. Open https://demoqa.com/progress-bar
3. Click Start
4. Add WebDriverWait for waiting “Reset” button is displayed
5. Click reset
6. Add WebDriverWait for waiting “Start” button is displayed
Пункт 6 нужно выполнить повторно инициализацию элемента (т к он исчезал с экрана)
Если этого не сделать будет словлен StaleElementReference Exception Напомню
инициализация выглядит
WebElement nameOfElement = driver.findElement("bla-bla-bla)
*/