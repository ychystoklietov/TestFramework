package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class StandAloneTest {

    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.xpath("//div/a[@class=\"login\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys("test4@mail.com");
        driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]")).sendKeys("TestName");
        driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]")).sendKeys("TestLastName");
        driver.findElement(By.xpath("//input[@id=\"passwd\"]")).sendKeys("Qwerty123");

        WebElement daysDropdown = driver.findElement(By.xpath("//select[@id=\"days\"]"));
        Select dropdownDays = new Select(daysDropdown);
        dropdownDays.selectByValue("15");

        WebElement monthsDropdown = driver.findElement(By.xpath("//select[@id=\"months\"]"));
        Select dropdownMonths = new Select(monthsDropdown);
        dropdownMonths.selectByValue("11");

        WebElement yearsDropdown = driver.findElement(By.xpath("//select[@id=\"years\"]"));
        Select dropdownYears = new Select(yearsDropdown);
        dropdownYears.selectByValue("1995");

        driver.findElement(By.xpath("//button[@id=\"submitAccount\"]")).click();

        String expectedResult = "Your account has been created.";

        String actualResult = driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]")).getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.close();

    }
}
