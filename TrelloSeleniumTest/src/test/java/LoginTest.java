import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        if(isLoggedIn()){
            logout();
        }
    }
    @Test
    public void testLogin() {
        initLoginToTheAccount();
        fillLoginForm("elena.telran@yahoo.com", "12345.com");
        submitLogin();

        Assert.assertTrue(isLoggedIn());
    }

    @Test
    public void testLoginNegative() {
        initLoginToTheAccount();
        fillLoginForm("elena", "12345.com");
        submitLogin();

        Assert.assertFalse(isLoggedIn());
    }
}
