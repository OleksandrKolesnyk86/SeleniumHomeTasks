import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class thirdTestUISelenium {
    @Test
    public void firstSeleniumTestLoginWithManager() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        By managerLocator = By.xpath("//button[text()='Bank Manager Login']");
        driver.findElement(managerLocator).click();
        By addCustomer = By.xpath("//button[@ng-click='addCust()']");
        driver.findElement(addCustomer).click();
        By firstNameOfCustomer = By.xpath("//input[@placeholder='First Name']");
        driver.findElement(firstNameOfCustomer).sendKeys("Volodymyr");
        By lastNameOfCustomer = By.xpath("//input[@placeholder='Last Name']");
        driver.findElement(lastNameOfCustomer).sendKeys("Kolesnyk");
        By postCodeOfCustomer = By.xpath("//input[@placeholder='Post Code']");
        driver.findElement(postCodeOfCustomer).sendKeys("76-200");
        By enterAddCustomer = By.xpath("//button[text()='Add Customer']");
        driver.findElement(enterAddCustomer).click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        By openAccount = By.xpath("//button[@ng-click='openAccount()']");
        driver.findElement(openAccount).click();
        driver.quit();
    }
}
/*2. Открыть сайт
https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
Залогиниться как manager
Добавить любого клиента (Add Customer)
Чтобы похендлить alert (нажать ok) можно использовать след:
driver.switchTo().alert().accept();
driver.switchTo().defaultContent();
Перейти на вкладку “Open Account”*/