package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.Page;

public class HomeTest extends BaseTest{
    WebDriver driver;
    Page page;

    public HomeTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;

    }

    @Test

    public void xpathTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test Start .......");
        Thread.sleep(1000);
        //page.getInstance(HomePage.class).getEmailField().sendKeys("jayed19@gmail.com");
        page.getInstance(HomePage.class).getCreatAccountLink().click();



   }


}
