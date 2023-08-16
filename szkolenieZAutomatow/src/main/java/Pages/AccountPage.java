package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    //Entry information locator
    By submitAccountLogin = By.className("info-account");

    //Method to get info about entry
    public String getSubmitAccountLogin() {
        String submitData = driver.findElement(submitAccountLogin).getText();
        return submitData;
    }





}
