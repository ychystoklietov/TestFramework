package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class ValidLoginTest {

    public static void main(String[] args) {

        String expectedResult = "Welcome to your account. Here you can manage all of your personal information and orders.";

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.automationpractice.pl/index.php");

        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        AccountPage account = new AccountPage(driver);

        home.clickLogin();

        login.enterUsingEmail("test@mail.com");
        login.enterPassword("Qwerty123");
        login.clickLoginBtn();
        Assert.assertEquals(account.getSubmitAccountLogin(), expectedResult);
        driver.quit();

    }
}
