import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayTest extends  TestBase{

   @Test
   public void registrationTest(){
       initNewUserRegistration();
       fillFirstNameForm();
       fillLastNameField();
       fillEmailField();
       fillPassword();
       clickOnButtonSubmitRegistration();
   }


}
