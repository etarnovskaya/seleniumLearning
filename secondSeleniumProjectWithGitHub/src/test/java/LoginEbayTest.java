import org.testng.annotations.Test;

public class LoginEbayTest extends TestBase{

    @Test
    public void ebayLoginTest() {
        initLogIn();
        fillLoginForm("etarnovskaya+1535359233097@gmail.com", "aA123456789");
        submitLogin();
    }

}

