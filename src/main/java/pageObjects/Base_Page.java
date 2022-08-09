package pageObjects;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.GlobalVars;

import java.time.Duration;

import static driver.DriverFactory.getDriver;

public class Base_Page {

    public Base_Page(){
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver(){
        return DriverFactory.getDriver();
    }
    public void navigateTo_Url(String url){
        getDriver().get(url);
    }

    public void sendKeys(WebElement element, String texto){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(texto);
    }

    public void waitForElementAndClick(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void waitForAlertAndValidate(String mensaje){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.alertIsPresent());
        String alert_msg = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alert_msg, mensaje);
    }

}
