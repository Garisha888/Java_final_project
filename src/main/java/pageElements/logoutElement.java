package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utility;

public class logoutElement {

    private final WebDriver driver;
    static utility util = new utility();

    private static By logoutclick = By.xpath("//a[text()='Log Out']");

    public void logoubuttonclick(){

        try {

            driver.findElement(logoutclick).click();
            util.loginfo("Logged Out Sucessfully");

        } catch (Exception e) {
            util.logerror("Could not log out");
        }
    }
    public logoutElement(WebDriver driver){

        this.driver=driver;

    }
}

