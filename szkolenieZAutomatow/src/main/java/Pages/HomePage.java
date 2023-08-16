package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Page variables
    String baseURL = "http://www.automationpractice.pl/index.php";

    //Locator for login button
    By loginBtn = By.className("login");

    //Open link
    public void openURL() {
        driver.get(baseURL);
    }

    //Method to click login button
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }




}

