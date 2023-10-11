package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.utility;

public class registerelements {

    private final WebDriver driver;
    static utility util = new utility();

    private final By clickregister = By.xpath("//a[contains(text(),'Register')]");
    private final By firstName = By.id("customer.firstName");
    private final By lastName = By.id("customer.lastName");
    private final By address = By.id("customer.address.street");
    private final By city = By.id("customer.address.city");
    private final By state = By.id("customer.address.state");
    private final By zipcode = By.id("customer.address.zipCode");
    private final By SSN= By.id("customer.ssn");
    private final By username = By.id("customer.username");
    private final By password = By.id("customer.password");
    private final By confirmPassword = By.id("repeatedPassword");
    private final By registerButton = By.xpath("//input[@value='Register']");

// Error elements

    private final By  fnameVal = By.id("customer.firstName.errors");
    private final By  lnameVal = By.id("customer.lastName.errors");
    private final By  addressVal = By.id("customer.address.street.errors");
    private final By  cityVal = By.id("customer.address.city.errors");
    private final By  stateVal = By.id("customer.address.state.errors");
    private final By  zipVal = By.id("customer.address.zipCode.errors");

    private final By  ssnVal = By.id("customer.ssn.errors");
    private final By  usernameVal = By.id("customer.username.errors");
    private final By  passVal = By.id("customer.password.errors");
    private final By  conpassVal = By.id("repeatedPassword.errors");

    public void registeraccount(String firstName,String lastName, String address, String city, String state, String zipcode, String SSN, String username, String password, String confirmpassword) {

    driver.findElement(this.clickregister).click();
    driver.findElement(this.firstName).sendKeys(firstName);
    driver.findElement(this.lastName).sendKeys(lastName);
    driver.findElement(this.address).sendKeys(address);
    driver.findElement(this.city).sendKeys(city);
    driver.findElement(this.state).sendKeys(state);
    driver.findElement(this.zipcode).sendKeys(zipcode);
    driver.findElement(this.SSN).sendKeys(SSN);
    driver.findElement(this.username).sendKeys(username);
    driver.findElement(this.password).sendKeys(password);
    driver.findElement(this.confirmPassword).sendKeys(confirmpassword);
    driver.findElement(this.registerButton).click();

    if(firstName.isEmpty()){
       String firstNameemptytext = driver.findElement(this.fnameVal).getText();
        util.logerror(firstNameemptytext);
    }
    if(lastName.isEmpty()){
        String lastNameemptytext = driver.findElement(this.lnameVal).getText();
        util.logerror(lastNameemptytext);
    }
    if(address.isEmpty()){
        String addressemptytext = driver.findElement(this.addressVal).getText();
        util.logerror(addressemptytext);
    }

    if(city.isEmpty()){
        String citytext = driver.findElement(this.cityVal).getText();
        util.logerror(citytext);
    }

    if(state.isEmpty()){
        String stateText = driver.findElement(this.stateVal).getText();
        util.logerror(stateText);
    }

    if(zipcode.isEmpty()){
        String zipcodetext = driver.findElement(this.zipVal).getText();
        util.logerror(zipcodetext);
    }

    if(SSN.isEmpty()){
        String ssntext = driver.findElement(this.ssnVal).getText();
        util.logerror(ssntext);
    }

    if(username.isEmpty()){
        String usernametext = driver.findElement(this.usernameVal).getText();
        util.logerror(usernametext);
    }

    if(password.isEmpty()){
        String passwordtext = driver.findElement(this.passVal).getText();
        util.logerror(passwordtext);
    }

    if(confirmpassword.isEmpty()){
        String conformpasswordText = driver.findElement(this.conpassVal).getText();
        util.logerror(conformpasswordText);
    }


    }

    public void alloutputtext(){

        By outputtext1=By.xpath("//div[@id='rightPanel']//h1");
        By outputtext2 = By.xpath("//div[@id='rightPanel']//p");

        util.waitForElementTObeVisible(driver,10,outputtext1);
        util.waitForElementTObeVisible(driver,10,outputtext2);
        WebElement outputtext11 = driver.findElement(By.xpath("//div[@id='rightPanel']//h1"));
        WebElement outputtext22 = driver.findElement(By.xpath("//div[@id='rightPanel']//p"));
        String getoutputtext11 = outputtext11.getText();
        String getoutputtext22 = outputtext22.getText();
        util.loginfo(getoutputtext11);
        util.loginfo(getoutputtext22);
    }

    public registerelements(WebDriver driver){

        this.driver=driver;
    }
}
