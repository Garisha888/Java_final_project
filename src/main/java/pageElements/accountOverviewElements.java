package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.utility;

import java.util.List;

public class accountOverviewElements {

    private final WebDriver driver;
    static utility util = new utility();

    public void clickaccountOverview(){

        driver.findElement(By.xpath("//a[text()='Accounts Overview']")).click();
    }



    public  void getRow(int a){

        WebElement getRowValues =driver.findElement(By.xpath("//tr[@class='ng-scope']"+"["+a+"]"));
        System.out.println(getRowValues.getText());
    }

    public void returndetails() {

        By detailswait= By.xpath("//tr[@class='ng-scope']");
        util.waitForElementTObeVisible(driver,20,detailswait);
        List<WebElement> tr = driver.findElements(By.xpath("//tr[@class='ng-scope']"));

        for (int a = 1; a <= tr.size(); a++) {
            getRow(a);
        }
    }



//    public void accountdetails(){
//
//       driver.findElement(accountOverviewclick).click();
//
//        List<WebElement> details = driver.findElements(By.xpath("//tr[@ng-repeat='account in accounts']//td"));
////        List<WebElement> details = driver.findElements(By.xpath("//table[@id='accountTable']//tbody"));
//        System.out.println("Accounts Overview");
//        System.out.println(details);
//
//
//        for (WebElement accountdetails : details){
//            WebElement a = accountdetails.findElement(By.xpath("//a[@class='ng-binding']"));
//            String accountnumer = a.getText();
//
//            WebElement b = accountdetails.findElement(By.xpath("//td[@class='ng-binding']"));
//            String Balance = b.getText();
//
//            WebElement c = accountdetails.findElement(By.xpath("//td[@class='ng-binding'][2]"));
//            String AvailableBalance = c.getText();
//
//            System.out.println("Hi");
//
//            System.out.println(accountnumer);
//            System.out.println(Balance);
//            System.out.println(AvailableBalance);
//
//
//        }
//
//    }

    public accountOverviewElements(WebDriver driver){

        this.driver=driver;

    }

}
