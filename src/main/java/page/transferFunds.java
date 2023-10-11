package page;

import org.openqa.selenium.WebDriver;
import pageElements.TransferFundsElements;
import pageElements.logInElements;
import utilities.utility;

public class transferFunds {

    static utility util = new utility();
    static WebDriver driver=util.intitializedriver("chrome");
    static logInElements logelement = new logInElements(driver);

    static TransferFundsElements transfer = new TransferFundsElements(driver);

    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        logelement.login("mydemoacc9","passdemO1");
        transfer.clicktransferfund();
        Thread.sleep(4000);
        transfer.valuetransferfunc("100");
        transfer.selectfromaccount();
        transfer.clicktransfer();
        transfer.alloutputtext();
//        driver.close();

    }
}
