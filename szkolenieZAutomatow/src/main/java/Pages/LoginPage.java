package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Locator for email field
    By UsingEmail = By.xpath("//input[@id=\"email\"]");
    //Locator for password field
    By password = By.xpath("//input[@id=\"passwd\"]");
    //Locator for submit button
    By loginBtn = By.xpath("//button[@id=\"SubmitLogin\"]");

    //Locator for login error message
    By errorDataMessage = By.xpath("//li[normalize-space()='Authentication failed.']");

    //Method to enter email
    public void enterUsingEmail(String useEmail) {
        driver.findElement(UsingEmail).sendKeys(useEmail);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    //Method to click login button
    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    //Method to get error message
    public String getErrorDataMessage() {
        String errorMessage = driver.findElement(errorDataMessage).getText();
        return errorMessage;
    }

}
