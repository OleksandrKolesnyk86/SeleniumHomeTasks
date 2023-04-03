import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testUISeleniumWaitsTaskFour {
    @Test
    public void waitsTestUISeleniumWaitsPartFour() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        By userName = By.xpath("//input[@id='user-name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys("standard_user");
        By password = By.xpath("//input[@id='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("secret_sauce");
        By loginEnter = By.xpath("//input[@id='login-button']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginEnter)).click();
        By sortChoose = By.xpath("//select");
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortChoose)).click();
        By sortPriceFromLowToHigh = By.xpath("//option[@value='lohi']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortPriceFromLowToHigh)).click();
        By addItemToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addItemToCart)).click();
        By shoppingCart = By.xpath("//div[@id='shopping_cart_container']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCart)).click();
        By itemPriceToCompare = By.xpath("//div[text()='7.99']");
        By itemPriceFromCartWithoutTax = By.xpath("//div[@class='inventory_item_price']");
        //получаем цену продукта из списка
        String itemPriceFromList = wait.until(ExpectedConditions.visibilityOfElementLocated(itemPriceToCompare)).getText();
        //получаем цену проджукта из корзины
        String itemPriceFromCart = wait.until(ExpectedConditions.visibilityOfElementLocated(itemPriceFromCartWithoutTax)).getText();
        //сравниваем цены выбраного продукта в списке продуктов и в корзине
        Assert.assertEquals(itemPriceFromList, itemPriceFromCart);
        By checkout = By.xpath("//button[@id='checkout']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout)).click();
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
        By totalPriceWithoutTax = By.xpath("//div[@class='summary_info']/div[@class='summary_subtotal_label']");
        //получаем цену продукта после ввода данных для покупки(без учета налога)
        String totalPriceWithoutTaxGetText = wait.until(ExpectedConditions.visibilityOfElementLocated(totalPriceWithoutTax)).getText();
        String itemPriceFromCartAfterCheckout = totalPriceWithoutTaxGetText.substring(totalPriceWithoutTaxGetText.indexOf("$"));
        //сравниваем цены выбраного продукта в списке продуктов, в корзине и после чекаута(без учета налога)
        Assert.assertEquals(itemPriceFromList, itemPriceFromCart, itemPriceFromCartAfterCheckout);
        double priceWithoutTax = Double.parseDouble(totalPriceWithoutTaxGetText.substring(totalPriceWithoutTaxGetText.indexOf("$") + 1));
        By tax = By.xpath("//div[@class='summary_tax_label']");
        String taxString = wait.until(ExpectedConditions.visibilityOfElementLocated(tax)).getText();
        double taxOnly = Double.parseDouble(taxString.substring(taxString.indexOf("$") + 1));
        double priceFromCartWithoutTaxOnly = Double.parseDouble(totalPriceWithoutTaxGetText.substring(totalPriceWithoutTaxGetText.indexOf("$") + 1));
        //Сравниваем цены выбранного продукта из списка, в корзине после чекаута и тотал прайс (без учета налога)
        Assert.assertEquals(itemPriceFromList, itemPriceFromCartAfterCheckout, totalPriceWithoutTaxGetText);
        //Получаем размер налога и тотал прайс до налога
        double totalPriceWithTax = priceFromCartWithoutTaxOnly + taxOnly;
        By totalPriceFromCart = By.xpath("//div[@class='summary_info_label summary_total_label']");
        String priceWithTax = wait.until(ExpectedConditions.visibilityOfElementLocated(totalPriceFromCart)).getText();
        double totalPriceFromCartWithTax = Double.parseDouble(priceWithTax.substring(priceWithTax.indexOf("$") + 1));
        //Сравниваем сумму покупки с учетом налога
        Assert.assertEquals(totalPriceWithTax, totalPriceFromCartWithTax);
        By finishButton = By.xpath("//button[@id='finish']");
        wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
        By checkoutComplete = By.xpath("//span[text()='Checkout: Complete!']");
        //проверяем совершена ли покупка
        Assert.assertEquals("Checkout: Complete!", wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutComplete)).getText());
        driver.quit();

    }

}
