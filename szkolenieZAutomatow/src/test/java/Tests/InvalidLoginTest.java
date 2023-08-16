package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void invalidLoginTest1() {
        String expectedResult = "Authentication failed.";

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        AccountPage account = new AccountPage(driver);

        home.openURL();
        home.clickLogin();
        login.enterUsingEmail("asdsa@mail.com");
        login.enterPassword("asdsadasd");
        login.clickLoginBtn();
        Assert.assertEquals(login.getErrorDataMessage(), expectedResult);
    }



}
