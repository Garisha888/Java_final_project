package page;

import org.openqa.selenium.WebDriver;
import pageElements.logInElements;
import pageElements.openNewAccountElements;
import pageElements.registerelements;
import utilities.utility;

public class openNewAccount {


    static utility util = new utility();

    static WebDriver driver = util.intitializedriver("chrome");

    static logInElements logelement = new logInElements(driver);

    static registerelements register = new registerelements(driver);

    static openNewAccountElements newacc  = new openNewAccountElements(driver);


    public static void main(String[] args)  {

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        logelement.login("mydemoacc11","passdemO1");
//        register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc8","passdemO1","passdemO1");
        newacc.clickopenNewacc();
        newacc.accountType();
        newacc.balanceTransferAcoount(2);
        newacc.buttonOpenNewAccount();
        newacc.alloutputtext();







    }
}
