import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CreateBoardTest  extends TestBase{
    private static String SELECT_CREATE_NEW_BOARD = "a.js-open-add-menu span.icon-add";
    //   static String PLUS_BUTTON_BYCSS_SELECTOR = "span.icon-add";

   @Test
    public void testCreationNewBoard(){
       //initCreationNrew board
        click(By.xpath("//a[@class='js-open-add-menu']"));//PLUS_BUTTON_BYCSS_SELECTOR));
        click(By.cssSelector(SELECT_CREATE_NEW_BOARD));

        type(By.cssSelector("input.subtle-input"),"test board");
    }

    @Test
    public void getBoardsCount(){
       int boardsCount = driver.findElements(
               By.cssSelector("div.is-badged")).size();


        List<WebElement> boards = driver.findElements(
                By.cssSelector("div.is-badged"));

        for(WebElement board : boards){
            String title = board.getText();
            System.out.println(title);

        }


        System.out.println(boardsCount);
    }
}
