package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sql.rowset.WebRowSet;

import java.time.Duration;

import static java.lang.System.exit;

public class utility {
    WebDriver driver;

    private static final Logger log = LogManager.getLogger(utility.class);

    public WebDriver intitializedriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                System.out.println(browser + "is not a valid browser.");
                exit(1);
        }
        return driver;
    }

    public Wait<WebDriver> genericWait(long time, WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(time));
    }

    public WebElement waitForElementTObeLocated(WebDriver driver, long time, By element) {
        Wait<WebDriver> wait = genericWait(time, driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement waitForElementTObeClickable(WebDriver driver, long time, By element) {
        Wait<WebDriver> wait = genericWait(time, driver);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public WebElement waitForElementTObeVisible(WebDriver driver, long time, By element) {
        Wait<WebDriver> wait = genericWait(time, driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void loginfo(String info){

        log.info(info);
    }

    public void logerror(String error){

        log.error(error);
    }
}