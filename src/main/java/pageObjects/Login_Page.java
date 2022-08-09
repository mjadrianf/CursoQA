package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class Login_Page extends Base_Page{

    private @FindBy(id= "text")
    WebElement usernameTxt;

    private @FindBy(id="password")
    WebElement passwordTxt;

    private @FindBy(id="login-button")
    WebElement loginBtn;

    public Login_Page(){super();}

    public void navigateToUrl(){
        navigateTo_Url(GlobalVars.HOME_PAGE_URL+"/Login-Portal/index.html");
    }

    public void setUsernameTxt(String usename){
        sendKeys(usernameTxt,usename);
    }

    public void setPasswordTxt(String password){
        sendKeys(passwordTxt,password);
    }

    public void clickOnLoginBtn(){
        waitForElementAndClick(loginBtn);
    }

    public void validateAlertExitosa(){waitForAlertAndValidate("validation succeeded");}

    public void validateAlertFallido(){waitForAlertAndValidate("validation failed");}
}
