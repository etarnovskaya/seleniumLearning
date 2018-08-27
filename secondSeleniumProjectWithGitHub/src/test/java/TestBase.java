import org.openqa.selenium.By;
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
        openEbay();
    }

    @AfterMethod
            public void tearDown(){
                driver.quit();
            }

    protected void submitLogin() {
            driver.findElement(By.id("sgnBt")).click();
        }

    protected void fillLoginForm() {
            driver.findElement(By.name("userid")).click();
            driver.findElement(By.name("userid")).clear();
            driver.findElement(By.name("userid")).sendKeys("etarnovskaya+1535359233097@gmail.com");

            driver.findElement(By.id("pass")).click();
            driver.findElement(By.id("pass")).clear();
            driver.findElement(By.id("pass")).sendKeys("aA123456789");
        }

    public void initLogIn() {
            driver.findElement(By.linkText("Sign in")).click();
        }

    public void openEbay() {
            driver.get("https://www.ebay.com/");
        }

    public void initNewUserRegistration() {
        driver.findElement(By.linkText("register")).click();
    }

    public void clickOnButtonSubmitRegistration() {
        driver.findElement(By.id("ppaFormSbtBtn")).click();
    }

    public void fillPassword() {
        driver.findElement(By.id("PASSWORD")).click();
        driver.findElement(By.id("PASSWORD")).clear();
        driver.findElement(By.id("PASSWORD"))
                .sendKeys("aA123456789");
    }

    public void fillEmailField() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        String email = "etarnovskaya+" + System.currentTimeMillis()+
                "@gmail.com";
                driver.findElement(By.id("email")).sendKeys(email);
        System.out.println(email);

    }

    public void fillLastNameField() {
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Tar");
    }

    public void fillFirstNameForm() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Lena");
    }
}
