package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    //Entry information locator
    By submitAccountLogin = By.className("login");

    //Method to get info about entry
    public String getSubmitAccountLogin() {
        String submitData = driver.findElement(submitAccountLogin).getText();
        return submitData;
    }





}
