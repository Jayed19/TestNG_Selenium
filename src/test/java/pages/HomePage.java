package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) throws IOException {
        super(driver);
    }

     private By CreatAccountLink = By.linkText("Create an Account");
    public WebElement getCreatAccountLink(){return elementWithWait(CreatAccountLink,"presence");}

}
