package page;

import org.openqa.selenium.WebDriver;
import pageElements.logInElements;
import pageElements.logoutElement;
import utilities.utility;

public class logIn {



    static utility util = new utility();
    static WebDriver driver = util.intitializedriver("chrome");

    static logInElements logelement = new logInElements(driver);

    static logoutElement logoutelement = new logoutElement(driver);



    public static void main(String[] args) {

            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/");
            logelement.login("mydemo","passdemO1");
//            logoutelement.logoubuttonclick();

        }
    }
