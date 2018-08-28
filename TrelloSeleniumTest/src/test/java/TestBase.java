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
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
