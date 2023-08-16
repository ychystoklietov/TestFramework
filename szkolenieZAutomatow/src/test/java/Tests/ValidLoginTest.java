package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class ValidLoginTest extends BaseTest {

    @Test
    public void validLoginTest1() {
        String expectedResult = "Welcome to your account. Here you can manage all of your personal information and orders.";

        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        AccountPage account = new AccountPage(driver);

        home.openURL();
        home.clickLogin();

        login.enterUsingEmail("test@mail.com");
        login.enterPassword("Qwerty123");
        login.clickLoginBtn();
        Assert.assertEquals(account.getSubmitAccountLogin(), expectedResult);
    }



}
