import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void testLogin() {
        initLoginToTheAccount();
        fillLoginForm();
        submitLogin();
    }

    private void submitLogin() {
        driver.findElement(By.id("login")).click();
    }

    private void fillLoginForm() {
        driver.findElement(By.id("user")).click();
        driver.findElement(By.id("user")).clear();
        driver.findElement(By.id("user")).sendKeys("elena.telran@yahoo.com");

        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("12345.com");
    }

    private void initLoginToTheAccount() {
        driver.findElement(By.linkText("Log In")).click();

    }


}
