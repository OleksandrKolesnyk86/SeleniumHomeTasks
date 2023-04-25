import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testUISeleniumWaitsTaskTwo {

    @Test
    public void waitsTestUISeleniumWaitsPartTwo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        By userName = By.xpath("//input[@id='user-name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).sendKeys("standard_user");
        By password = By.xpath("//input[@id='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys("secret_sauce");
        By loginEnter = By.xpath("//input[@id='login-button']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginEnter));
        driver.findElement(loginEnter).click();
        By firstItemAdd = By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstItemAdd));
        driver.findElement(firstItemAdd).click();
        By secondItemAdd = By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondItemAdd));
        driver.findElement(secondItemAdd).click();
        By thirdItemAdd = By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(thirdItemAdd));
        driver.findElement(thirdItemAdd).click();
        By fourthItemAdd = By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fourthItemAdd));
        driver.findElement(fourthItemAdd).click();
        By shoppingCart = By.xpath("//*[@class='shopping_cart_link']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCart));
        driver.findElement(shoppingCart).click();
        By checkout = By.xpath("//*[@id='checkout']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
        driver.findElement(checkout).click();
        By firstName = By.xpath("//*[@id='first-name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        driver.findElement(firstName).sendKeys("Kolesnyk");
        By lastName = By.xpath("//*[@id='last-name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName));
        driver.findElement(lastName).sendKeys("Oleksandr");
        By postalCode = By.xpath("//*[@id='postal-code']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(postalCode));
        driver.findElement(postalCode).sendKeys("76-200");
        By continueButton = By.xpath("//*[@id='continue']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
        driver.findElement(continueButton).click();
        By finishButton = By.xpath("//*[@id='finish']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishButton));
        driver.findElement(finishButton).click();
        By backToHomeButton = By.xpath("//*[@id='back-to-products']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(backToHomeButton));
        driver.findElement(backToHomeButton).click();
        driver.quit();
    }
}


/*B)
1. Open “https://www.saucedemo.com/“
2. Login with standard_user
3. Add to cart first 4 products
4. Navigate to cart
5. Tap Checkout
6. Fill user data (First Name / Last Name / Zip)
7. Tap Continue
8. Tap Finish
9. Tap Back To Home*/