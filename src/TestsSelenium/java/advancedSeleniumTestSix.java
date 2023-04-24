import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class advancedSeleniumTestSix {
    @Test
    public void advancedTestSix() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/automation-practice-form");
        By firstName = By.cssSelector("#firstName");
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys("Kolesnyk");
        By lastName = By.cssSelector("#lastName");
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys("Oleksandr");
        By userEmail = By.cssSelector("#userEmail");
        wait.until(ExpectedConditions.elementToBeClickable(userEmail)).sendKeys("11111@gmail.com");
        By genderChoose = By.xpath("//*[contains(text(), \"Male\")]");
        wait.until(ExpectedConditions.elementToBeClickable(genderChoose)).click();
        By mobileNumber = By.cssSelector("#userNumber");
        wait.until(ExpectedConditions.elementToBeClickable(mobileNumber)).sendKeys("8955262314");
        By dateOfBirth = By.cssSelector("#dateOfBirth");
        wait.until(ExpectedConditions.elementToBeClickable(dateOfBirth)).click();
        By yearSelect = By.cssSelector("[class*=\"year-select\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(yearSelect)).click();
        By yearSelecting = By.cssSelector("[value*=\"1986\"]");
        wait.until(ExpectedConditions.elementToBeClickable(yearSelecting)).click();
        By monthSelect = By.cssSelector("[class*=\"month-select\"]");
        wait.until(ExpectedConditions.elementToBeClickable(monthSelect)).click();
        By monthSelecting = By.xpath("//option[text()='May']");
        wait.until(ExpectedConditions.elementToBeClickable(monthSelecting)).click();
        By daySelecting = By.cssSelector("[aria-label*=\"May 29th\"]");
        wait.until(ExpectedConditions.elementToBeClickable(daySelecting)).click();
        By hobbySelecting = By.xpath("//label[text()='Sports']");
        wait.until(ExpectedConditions.elementToBeClickable(hobbySelecting)).click();
        By userAddress = By.cssSelector("#currentAddress");
        wait.until(ExpectedConditions.elementToBeClickable(userAddress)).sendKeys("Wall Street 21");
        javascriptExecutor.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        By countrySelect = By.cssSelector("#state");
        wait.until(ExpectedConditions.elementToBeClickable(countrySelect)).click();
        By countrySelecting = By.xpath("//div[text()='NCR']");
        wait.until(ExpectedConditions.elementToBeClickable(countrySelecting)).click();
        By citySelect = By.cssSelector("#city");
        wait.until(ExpectedConditions.elementToBeClickable(citySelect)).click();
        By citySelecting = By.xpath("//div[text()='Delhi']");
        wait.until(ExpectedConditions.elementToBeClickable(citySelecting)).click();
        wait.until(ExpectedConditions.elementToBeClickable(citySelect)).click();
        By submit = By.cssSelector("#submit");
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
        driver.quit();
    }
}
/*1.Open https://demoqa.com/automation-practice-form
2. Fill the form (please skip steps upload file and subjects)
3. Submit*/