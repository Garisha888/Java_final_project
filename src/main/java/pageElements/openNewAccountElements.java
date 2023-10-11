package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.utility;

public class openNewAccountElements {
    private final WebDriver driver;
    static utility util = new utility();
    private final By clickopenNewAccount = By.xpath("//a[@href='/parabank/openaccount.htm']");

    private final By buttonclick = By.xpath("//input[@type='submit']");

    public void clickopenNewacc()
    {
        driver.findElement(clickopenNewAccount).click();
    }
    public void accountType(){

        Select accounttype = new Select(driver.findElement(By.id("type")));
        accounttype.selectByIndex(1);

    }


    public void balanceTransferAcoount(int a){
         By selectAcount = By.id("fromAccountId");
        util.waitForElementTObeLocated(driver,200,selectAcount);
//        Select balanceTransferAccount = new Select(driver.findElement(selectAmount));
        driver.findElement(selectAcount).click();
        By waitoptions = By.xpath("//select[@id='fromAccountId']//option["+a+"]");
        util.waitForElementTObeLocated(driver,20,waitoptions);
        driver.findElement(By.xpath("//select[@id='fromAccountId']//option["+a+"]")).click();

    }

    public void buttonOpenNewAccount(){
        util.waitForElementTObeLocated(driver,20,buttonclick);
        WebElement clickbutton = driver.findElement(By.xpath("//input[@type='submit']"));
        clickbutton.click();

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



    public openNewAccountElements(WebDriver driver){

        this.driver=driver;

    }

}
