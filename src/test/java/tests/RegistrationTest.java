package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.Page;
import pages.RegistrationPage;
import org.testng.Assert;
public class RegistrationTest extends BaseTest{

    WebDriver driver;
    Page page;
    public RegistrationTest(String url){
        super(url);
    }



    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page=BaseTest.page;

    }


    @Test(dependsOnMethods = {"tests.HomeTest.xpathTest"})
    public void registrationTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Registration Start .......");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Get the title of the page
        String actualTitle = driver.getTitle();

        // Expected title
        String expectedTitle = "Create New Customer Account";

        // Assert or verify the page title
        Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match the expected title");



        Thread.sleep(5000);
        //page.getInstance(HomePage.class).getEmailField().sendKeys("jayed19@gmail.com");
        page.getInstance(RegistrationPage.class).getFirstName().sendKeys("Jayed");
        page.getInstance(RegistrationPage.class).getLastName().sendKeys("Ibrahim");
        page.getInstance(RegistrationPage.class).getEmailAddress().sendKeys("auto101@yopmail.com");
        page.getInstance(RegistrationPage.class).getPassword().sendKeys("1qazZAQ!");
        page.getInstance(RegistrationPage.class).getConfirmPassword().sendKeys("1qazZAQ!");
        page.getInstance(RegistrationPage.class).getRegistrationSubmitButton().submit();

        Thread.sleep(10000);
    }


}
