package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for login button
    By loginBtn = By.xpath("//a[@class=\"login\"]");

    //Method to click login button
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }




}

