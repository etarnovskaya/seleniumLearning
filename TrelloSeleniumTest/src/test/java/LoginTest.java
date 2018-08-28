import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void testLogin() {
        initLoginToTheAccount();
        fillLoginForm("elena.telran@yahoo.com", "12345.com");
        submitLogin();
    }

    public void submitLogin() {
        driver.findElement(By.id("login")).click();
    }

    public void fillLoginForm(String email, String password) {
        driver.findElement(By.id("user")).click();
        driver.findElement(By.id("user")).clear();
        driver.findElement(By.id("user")).sendKeys(email);

        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void initLoginToTheAccount() {
        driver.findElement(By.linkText("Log In")).click();

    }


}
