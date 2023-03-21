import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class secondTestUISelenium {

    @Test
    public void firstSeleniumTestLoginWithManager() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        By customerLocator = By.xpath("//button[@ng-click='customer()']");
        driver.findElement(customerLocator).click();
        By customerName = By.xpath("//select[@ng-model='custId']");
        driver.findElement(customerName).click();
        By chooseName = By.xpath("//option[text()='Harry Potter']");
        driver.findElement(chooseName).click();
        By login = By.xpath("//button[text()='Login']");
        driver.findElement(login).click();
        By deposit = By.xpath("//button[@ng-click='deposit()']");
        driver.findElement(deposit).click();
        By amountDeposit = By.xpath("//input[@placeholder='amount']");
        driver.findElement(amountDeposit).sendKeys("1000");
        By enterDeposit = By.xpath("//button[text()='Deposit']");
        driver.findElement(enterDeposit).click();
        By withdraw = By.xpath("//button[@ng-click='withdrawl()']");
        driver.findElement(withdraw).click();
        By amountWithdraw = By.xpath("//input[@ng-model='amount']");
        driver.findElement(amountWithdraw).sendKeys("900");
        By transactions = By.xpath("//button[@ng-click='transactions()']");
        driver.findElement(transactions).click();
        By reset = By.xpath("//button[@ng-click='reset()']");
        driver.findElement(reset).click();
        driver.quit();
    }
}
/*1. Открыть сайт
https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
Залогиниться как Customer (for ex Harry Potter)
Зайти в Deposit, положить 1000 на депозит
Зайти в Withdraw, снять 900
Зайти в Transactions удалить все записи
*/