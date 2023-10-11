package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utility;

public class logoutElement {

    private final WebDriver driver;
    static utility util = new utility();

    private static By logoutclick = By.xpath("//a[text()='Log Out']");

    public void logoubuttonclick(){

        driver.findElement(logoutclick).click();
        util.loginfo("Logged Out Sucessfully");
    }
    public logoutElement(WebDriver driver){

        this.driver=driver;

    }
}
