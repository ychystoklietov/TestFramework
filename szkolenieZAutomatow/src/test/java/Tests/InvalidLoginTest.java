package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class InvalidLoginTest {

    public static void main(String[] args) {

        String expectedResult = "Authentication failed.";

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.automationpractice.pl/index.php");

        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        AccountPage account = new AccountPage(driver);

        home.clickLogin();
        login.enterUsingEmail("asdsa@mail.com");
        login.enterPassword("asdsadasd");
        login.clickLoginBtn();
        Assert.assertEquals(login.getErrorDataMessage(), expectedResult);
        driver.quit();

    }
}
