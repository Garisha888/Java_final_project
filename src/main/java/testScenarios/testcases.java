package testScenarios;

import org.openqa.selenium.WebDriver;
import pageElements.*;
import utilities.utility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class testcases {

    static utility util = new utility();
    static WebDriver driver = util.intitializedriver("chrome");
    static registerelements register = new registerelements(driver);
    static logInElements logelement = new logInElements(driver);
    static TransferFundsElements transfer = new TransferFundsElements(driver);
    static accountOverviewElements overview = new accountOverviewElements(driver);
    static openNewAccountElements newacc  = new openNewAccountElements(driver);
    static logoutElement logoutelement = new logoutElement(driver);




    @BeforeTest
    public void setup(){

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");


    }

    @Test(priority = 1)
    public void allemptyregister(){
        register.registeraccount("","","","","","","","","","");

    }

    @Test(priority = 2)
    public void someemptyregister(){
        register.registeraccount("","demo","kathmandu","","Bagmati","1","100","mydemoacc9","passdemO1","passdemO1");
    }

    @Test(priority = 3 , enabled = false)
    public void registervalid(){
        register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc9","passdemO1","passdemO1");
        register.alloutputtext();
    }
    @Test(priority = 4)
    public void login(){
        // register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc1","passdemO1","passdemO1");

        logelement.login("mydemoacc11","passdemO1");

    }

    @Test(priority = 5)
    public void opennewAccount(){
        // register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc1","passdemO1","passdemO1");
//        logelement.login("mydemoacc11","passdemO1");
        newacc.clickopenNewacc();
        newacc.accountType();
        newacc.balanceTransferAcoount(2);
        newacc.buttonOpenNewAccount();
        newacc.alloutputtext();

    }

    @Test(priority = 6)
    public void transferFunds() throws InterruptedException {
        // register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc1","passdemO1","passdemO1");
//        logelement.login("mydemoacc9","passdemO1");
        transfer.clicktransferfund();
        Thread.sleep(4000);
        transfer.valuetransferfunc("100");
        transfer.selectfromaccount();
        transfer.clicktransfer();
        transfer.alloutputtext();
    }

    @Test(priority = 7)
    public void accountOverviews(){
        // register.registeraccount("demo","demo","kathmandu","kalanki","Bagmati","1","100","mydemoacc1","passdemO1","passdemO1");
//        logelement.login("mydemoacc9","passdemO1");
        overview.clickaccountOverview();
        overview.returndetails();


    }

    @AfterTest
    public void teardown(){
        logoutelement.logoubuttonclick();
        driver.quit();
    }

}
