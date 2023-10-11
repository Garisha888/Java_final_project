package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageElements.accountOverviewElements;
import pageElements.logInElements;
import pageElements.registerelements;
import utilities.utility;

import java.util.List;

public class accountOverview {
    static utility util = new utility();

    static WebDriver driver=util.intitializedriver("chrome");

    static registerelements register = new registerelements(driver);
    static accountOverviewElements overview = new accountOverviewElements(driver);
    static logInElements logelement = new logInElements(driver);



    public static void main(String[] args) throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
//        register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc1","passdemO1","passdemO1");
        logelement.login("mydemoacc9","passdemO1");
        overview.returndetails();

    }
}
