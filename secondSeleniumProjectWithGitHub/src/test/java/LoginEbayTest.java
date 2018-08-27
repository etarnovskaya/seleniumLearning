import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.Test;

        import java.util.concurrent.TimeUnit;

public class LoginEbayTest extends TestBase{

    @Test
    public void ebayLoginTest() {
        initLogIn();
        fillLoginForm();
        submitLogin();
    }

}

