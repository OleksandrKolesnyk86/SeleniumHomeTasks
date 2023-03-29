import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class testUISeleniumWaits {
    @Test
    public void waitsTestUISeleniumWaits() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        By userName = By.xpath("//input[@id='userName']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).sendKeys("sanyakolesnik");
        By password = By.xpath("//input[@id='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys("Sanya@1986");
        By enterLogin = By.xpath("//button[text()='Login']");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterLogin));
        driver.findElement(enterLogin).click();
        By goToBookStore = By.xpath("//button[@id='gotoStore']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToBookStore));
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(goToBookStore));
        driver.findElement(goToBookStore).click();
        By gitPocketGuide = By.xpath("//a[text()='Git Pocket Guide']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(gitPocketGuide));
        driver.findElement(gitPocketGuide).click();
        driver.manage().window().maximize();
        By addBookToCollection = By.xpath("//button[text()='Add To Your Collection']");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addBookToCollection));
        driver.findElement(addBookToCollection).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        By returnToBookStore = By.xpath("//button[text()='Back To Book Store']");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(returnToBookStore));
        driver.findElement(returnToBookStore).click();
        By dontKnowJS = By.xpath("//*[contains(text(),\"You Don't Know JS\")]");
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dontKnowJS));
        driver.findElement(dontKnowJS).click();
        By addToCollectionKnowJS = By.xpath("//button[text()='Add To Your Collection']");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCollectionKnowJS));
        driver.findElement(addToCollectionKnowJS).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(returnToBookStore));
        driver.findElement(returnToBookStore);
        By profile = By.xpath("//span[text()='Profile']");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
        driver.findElement(profile).click();
        By deleteAllBooks = By.xpath("//div[@class='text-right button di']/button[text()='Delete All Books']");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteAllBooks));
        driver.findElement(deleteAllBooks).click();
        By deleteOk = By.xpath("//button[text()='OK']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteOk));
        driver.findElement(deleteOk).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
/*A)
1. Open “https://demoqa.com/login”
2. Login (create your own user before)
3. Go to Book Store (Here you can catch ElementClickIntercepted Exception, to
avoid this use scroll or click using JavaScriptExecutor)
4. Choose Git Pocket Guide
5. Click “Add to your Collection”
6. Handle alert similar as from last lesson (Tap Ok)
7. Click Back To Store
8. Click "You Don’t Know JS”
9. “Add to your Collection”
10.Handle Alert
11. Go to “Profile”
12.Click “Delete All Books*/