package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        //Create a Chrome driver. All test classes use this
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        //Close browser
        driver.quit();
    }



}
