package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    @FindBy(id = "Email")
     WebElement EmailField;
    //By emailfield = By.id("Email");

    @FindBy(name = "Password")
    WebElement passwordField;
    //By passwordField=By.name("Password");


    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    //By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    @FindBy(xpath = "//a[text()='Log out']")
    WebElement logoutLink;
    //By logoutLink =By.xpath("//a[(text()='Log out')]");


    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMag;
    //By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText() {
        log.info("getting text from : "+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }


    public void enterEmailId(String email){
        sendTextToElement(EmailField,email);
    }

    public  void enterPassword(String Password){
        sendTextToElement(passwordField,Password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMag);
    }

    public String VerifyLogoutLink(){

        return getTextFromElement(logoutLink);
    }

    public void ClickonLogoutLink(){
        this.clickOnElement(this.logoutLink);
    }

    public void loginToApplication(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }
}
