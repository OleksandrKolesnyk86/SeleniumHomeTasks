import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class fifthTestUISelenium {
    @Test
    public void fourthTestSelenium() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        By managerLocator = By.xpath("//button[text()='Bank Manager Login']");
        driver.findElement(managerLocator).click();
        By customersChoose = By.xpath("//button[@ng-click='showCust()']");
        driver.findElement(customersChoose).click();
        List<WebElement> deleteCustomer = driver.findElements(By.name("Delete"));
        for (WebElement element : deleteCustomer) {
            element.click();
        }
        driver.quit();
    }
}
/*4. https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
Залогиниться как manager
перейти на вкладку “customers”
удалить все аккаунты*/