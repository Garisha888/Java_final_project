package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.utility;

public class TransferFundsElements {

    private final WebDriver driver;

    static utility util = new utility();
    private final By clickTransferFund = By.xpath("//a[contains(text(),'Transfer Funds')]");

    private final By enterAmount = By.id("amount");

    private final By fromAccount = By.xpath("//select[@id='fromAccountId']");
    private final By toAccount = By.id("toAccountId");

    private final By buttonTransfer = By.xpath("//input[@value='Transfer']");



    public void clicktransferfund() {
        driver.findElement(this.clickTransferFund).click();
    }

    public void valuetransferfunc(String amount){
        driver.findElement(this.enterAmount).sendKeys(amount);

    }

    public void selectfromaccount()  {
        util.waitForElementTObeLocated(driver,10,fromAccount);
        Select fromAcc = new Select(driver.findElement( By.xpath("//select[@id='fromAccountId']")));
        fromAcc.selectByIndex(1);
        util.waitForElementTObeLocated(driver,10,toAccount);
        Select toAcc = new Select(driver.findElement(By.xpath("//select[@id='toAccountId']")));
        toAcc.selectByIndex(2);



//        By selectfromaccount = ( By.xpath("//select[@id='fromAccountId']"));
//        util.waitForElementTObeClickable(driver,10,selectfromaccount);
//        driver.findElement(selectfromaccount).click();
//        driver.findElement(By.xpath("//Select[@id='fromAccountId']//option["+a+"]")).click();
    }

//    public void selecttoaccount(int b)  {
//        By selecttoaccount = ( By.xpath("//select[@id='toAccountId']"));
//        util.waitForElementTObeClickable(driver,10,selecttoaccount);
//        driver.findElement(selecttoaccount).click();
//        driver.findElement(By.xpath("//Select[@id='toAccountId']//option["+b+"]")).click();
//    }

    public void clicktransfer(){

        driver.findElement(this.buttonTransfer).click();
    }

    public void alloutputtext(){

        By outputtext1=By.xpath("//div[@ng-if='showResult']//h1");
        By outputtext2 = By.xpath("//div[@ng-if='showResult']//p");

        util.waitForElementTObeVisible(driver,10,outputtext1);
        util.waitForElementTObeVisible(driver,10,outputtext2);
        WebElement outputtext11 = driver.findElement(By.xpath("//div[@ng-if='showResult']//h1"));
        WebElement outputtext22 = driver.findElement(By.xpath("//div[@ng-if='showResult']//p"));
        String getoutputtext11 = outputtext11.getText();
        String getoutputtext22 = outputtext22.getText();
        util.loginfo(getoutputtext11);
        util.loginfo(getoutputtext22);

    }




    public TransferFundsElements(WebDriver driver){
        this.driver = driver;

    }
}
