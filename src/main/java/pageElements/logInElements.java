package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utility;

public class logInElements {

    static utility util = new utility();

    private final WebDriver driver;

    private final By loginUsername = By.name("username");

    private final By loginPassword = By.name("password");

    private final By loginButton = By.xpath("//input[@type='submit']");


    public void login(String username, String password) {
        try {
            driver.findElement(this.loginUsername).sendKeys(username);
            driver.findElement(this.loginPassword).sendKeys(password);
            driver.findElement(this.loginButton).click();

        }
        catch (Exception e) {
            util.logerror("Failed to log in");
        }


    }

    public logInElements(WebDriver driver){

        this.driver=driver;

    }

}

