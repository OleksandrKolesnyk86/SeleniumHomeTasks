import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class advancedSeleniumTestSeven {
    @Test
    public void advancedTestSeven(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://demoqa.com/text-box");
        By userName = By.cssSelector("#userName");
        wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys("Oleksandr Kolesnyk");
        By userEmail = By.cssSelector("#userEmail");
        wait.until(ExpectedConditions.elementToBeClickable(userEmail)).sendKeys("11111@gmail.com");
        By currentAddress = By.cssSelector("#currentAddress");
        wait.until(ExpectedConditions.elementToBeClickable(currentAddress)).sendKeys("Poland, Slupsk, 76-200, Moniuszki Street 7/35");
        By permanentAddress  = By.cssSelector("#permanentAddress");
        wait.until(ExpectedConditions.elementToBeClickable(permanentAddress)).sendKeys("The same as current");
        By submit = By.cssSelector("#submit");
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
        driver.quit();
    }
}
/*.
1.Open https://demoqa.com/text-box
2. Fill text form
3. Submit*/