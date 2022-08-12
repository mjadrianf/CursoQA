package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class ContactUs_Page extends Base_Page {

    private @FindBy(name = "first_name")
    WebElement firstname_txt;

    private @FindBy(name = "last_name")
    WebElement lastname_txt;

    private @FindBy(name = "email")
    WebElement email_txt;

    private @FindBy(name = "message")
    WebElement message_txt;

    private @FindBy(xpath = "//*[@id='form_buttons']/input[2]")
    WebElement submit_btn;

    private @FindBy(name = "contact_reply")
    WebElement contact_reply;

    public ContactUs_Page(){super();}
    ////*[@id="form_buttons"]/input[2]
    //xpath

    //    private @FindBy(css = "input.feedback-input")
    //    WebElement firstname_txt;
    public void navigateToURL(){
        navigateTo_Url(GlobalVars.HOME_PAGE_URL+"/Contact-Us/contactus.html");
    }

    public void setFirstname_txt(String firstName){
        sendKeys(firstname_txt,firstName);
    }

    public void setLastname_txt(String lastName){
        sendKeys(lastname_txt,lastName);
    }

    public void setEmail_txt(String email){
        sendKeys(email_txt, email);
    }

    public void setMessage_txt(String message){
        sendKeys(message_txt, message);
    }

    public void setSubmit_btn(){
        waitForElementAndClick(submit_btn);
    }

    public void contact_reply(){
        
    }
}
