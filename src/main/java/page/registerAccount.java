package page;

import org.openqa.selenium.WebDriver;
import pageElements.logInElements;
import pageElements.registerelements;
import utilities.utility;

public class registerAccount {
    static utility util = new utility();
    static WebDriver driver=util.intitializedriver("chrome");
    static registerelements register = new registerelements(driver);
    static logInElements logelement = new logInElements(driver);

    public static void main(String[] args){
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");

        register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc20","passdemO1","passdemO1");
        register.alloutputtext();



    }
}
