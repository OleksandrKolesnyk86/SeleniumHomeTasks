import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstUITest {
    @Test
    public void firstSeleniumTestLogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanya\\IdeaProjects\\testsSelenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.i.ua/");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hfvjgyfljyf");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jhfkutyfluk");
        driver.findElement(By.xpath("//input[@title='Вхід на пошту']")).click();
        driver.quit();
    }

    @Test
    public void firstSeleniumTestLoginWithManager() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.i.ua/");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hfvjgyfljyf");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jhfkutyfluk");
        driver.findElement(By.xpath("//input[@title='Вхід на пошту']")).click();
        driver.quit();
    }
}
