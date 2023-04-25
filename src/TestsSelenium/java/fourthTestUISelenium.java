import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fourthTestUISelenium {
    @Test
    public void fourthTestSelenium() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        By managerLocator = By.xpath("//button[text()='Bank Manager Login']");
        driver.findElement(managerLocator).click();
        By openAccount = By.xpath("//button[@ng-click='openAccount()']");
        driver.findElement(openAccount).click();
        By customerChoose = By.xpath("//select[@ng-model='custId']");
        driver.findElement(customerChoose).click();
        By customerHarryPotter = By.xpath("//option[text()='Harry Potter']");
        driver.findElement(customerHarryPotter).click();
        By currencyButton = By.xpath("//select[@name='currency']");
        driver.findElement(currencyButton).click();
        By currencyChoose = By.xpath("//option[text ()='Dollar']");
        driver.findElement(currencyChoose).click();
        By processButton = By.xpath("//button[text ()='Process']");
        driver.findElement(processButton).click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        driver.quit();
    }
}

/*3. Открыть сайт
https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
Залогиниться как manager
Открыть вкладку “Open Account”
Создать счет*/