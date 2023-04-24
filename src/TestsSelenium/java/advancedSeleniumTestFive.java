import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class advancedSeleniumTestFive {
    @Test
    public void advancedTestFive(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://demoqa.com/frames");
        By firstFrame = By.cssSelector("#frame1");
        driver.switchTo().frame(driver.findElement(firstFrame));
        By textFirstFrame = By.cssSelector("#sampleHeading");
        String firstText = wait.until(ExpectedConditions.visibilityOfElementLocated(textFirstFrame)).getText();
        System.out.println(firstText);
        driver.switchTo().defaultContent();
        By secondFrame = By.cssSelector("#frame2");
        driver.switchTo().frame(driver.findElement(secondFrame));
        By textSecondFrame = By.cssSelector("#sampleHeading");
        String secondText = wait.until(ExpectedConditions.visibilityOfElementLocated(textSecondFrame)).getText();
        System.out.println(secondText);
        driver.quit();
    }
}
/*1. Open https://demoqa.com/frames
2. Switch to first frame
3. Get text from frame and print it
4. Switch to default content
5. Switch to second frame
6. Get text from second frame and print it*/