package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) throws IOException{
        super(driver);

    }


    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By emailAddress = By.id("email_address");
    private By password = By.id("password");
    private By passwordConfirmation = By.id("password-confirmation");
    private  By registerSubmit=By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");



    public WebElement getFirstName(){return elementWithWait(firstName,"presence");}
    public WebElement getLastName(){
       return (WebElement) elementWithWait(lastName,"presence");

    }
    public WebElement getEmailAddress(){
       return (WebElement) elementWithWait(emailAddress,"presence");

    }
    public WebElement getPassword(){
       return (WebElement) elementWithWait(password,"presence");

    }

    public WebElement getConfirmPassword(){
       return (WebElement) elementWithWait(passwordConfirmation,"presence");

    }

    public WebElement getRegistrationSubmitButton(){
        return (WebElement) elementWithWait(registerSubmit,"clickable");

    }
}
