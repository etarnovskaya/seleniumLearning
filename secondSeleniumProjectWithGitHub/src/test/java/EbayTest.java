import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayTest {
   ChromeDriver driver;

   @Test
   public void setUp(){
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       openEBay();
       initNewUserRegistration();
       fillFirstNameForm();
       fillLastNameField();
       fillEmailField();
       fillPassword();
       clickOnButtonSubmitRegistration();


       driver.quit();
   }

    public void openEBay() {
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
        driver.findElement(By.id("PASSWORD")).sendKeys("aA123456789");
    }

    public void fillEmailField() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email"))
                .sendKeys("etarnovskaya+" + TimeUnit.SECONDS + "@gmail.com");
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
