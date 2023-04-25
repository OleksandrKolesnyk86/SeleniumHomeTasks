import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testUISeleniumWaitsTaskThree {
    @Test
    public void waitsTestUISeleniumWaitsPartThree() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
        driver.manage().window().maximize();
        By toDoMakeHomework = By.xpath("//input[@type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(toDoMakeHomework));
        driver.findElement(toDoMakeHomework).click();
        driver.findElement(toDoMakeHomework).sendKeys("MAKE HOMEWORK", Keys.ENTER);
        By toDoPracticeAutomation = By.xpath("//input[@type='text']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(toDoPracticeAutomation));
        driver.findElement(toDoPracticeAutomation).sendKeys("Practice Automation", Keys.ENTER);
        By resolverPracticeMagic = By.xpath("//li[text()=' Practice magic']");
        wait.until(ExpectedConditions.elementToBeClickable(resolverPracticeMagic)).click();
        By deleteBuyNewRobes = By.xpath("//li[text()=' Buy new robes']");
        wait.until(ExpectedConditions.elementToBeClickable(deleteBuyNewRobes));
        By deleteTotal = By.xpath("//ul/li[2]/span/i[@class='fa fa-trash']");
        driver.findElement(deleteTotal).click();
        driver.quit();
    }
}
/*C)
1. Open “http://webdriveruniversity.com/To-Do-List/index.html”
2. Add new ToDo “MAKE HOMEWORK”
3. Add new ToDo “Practice Automation”
4. Mark Practice magic as resolver
5. Если получится - удалить из списка “Buy New Robes” (там нужен будет
mouse hover)*/