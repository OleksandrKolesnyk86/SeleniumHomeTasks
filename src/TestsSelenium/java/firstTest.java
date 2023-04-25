import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTest {
    @AfterTest
    public void postconditions() {
        System.out.println("After test");
    }

    @Test
    public void firstTest() {
        System.out.println("Hello first test ng test");
    }

    @BeforeTest
    public void preconditions() {
        System.out.println("Some preconditions");
    }
}
