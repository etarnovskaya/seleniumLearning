import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts()
                .implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://trello.com");
        logIn();
    }

    public void logIn() {
        initLoginToTheAccount();
        fillLoginForm("elena.telran@yahoo.com", "12345.com");
        submitLogin();
    }

    public void logout() {
        click(By.className("member-avatar"));
        click(By.cssSelector("a.js-logout"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

    public void submitLogin() {
        click(By.id("login"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("user"), email);
        type(By.name("password"), password);

    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void initLoginToTheAccount() {
        click(By.linkText("Log In"));

    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isLoggedIn(){
        return isElementPresent(By.className("member-avatar"));

    }
}
