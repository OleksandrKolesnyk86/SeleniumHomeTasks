import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class advancedSeleniumTestFour {
@Test
    public void advancedTestFour(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    driver.get("https://demoqa.com/dynamic-properties");
    By after = By.cssSelector("#visibleAfter");
    wait.until(ExpectedConditions.visibilityOfElementLocated(after));
    driver.quit();
}
}
/*1. Launch new Browser
2. Open “https://demoqa.com/dynamic-properties
3. Add WebDriverWait for waiting to button “Visible After 5 Seconds” to be
displayed
*/