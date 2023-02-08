package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="register-button")
    WebElement  RegisterButton;
    //By RegisterButton = By.id("register-button");


    @FindBy(id="FirstName-error")
    WebElement  ErrorFirstname;
    //By ErrorFirstname = By.id("FirstName-error");


    @FindBy(id="LastName-error")
    WebElement  ErrorLastname;
    //By ErrorLastname = By.id("LastName-error");


    @FindBy(id="Email-error")
    WebElement  ErrorEmail;
    //By ErrorEmail =By.id("Email-error");


    @FindBy(id="Password-error")
    WebElement  ErrorPassword;
    //By ErrorPassword =By.id("Password-error");

    @FindBy(id="ConfirmPassword-error")
    WebElement  ErrorConfirmPassword;
    //By ErrorConfirmPassword = By.id("ConfirmPassword-error");


    @FindBy(id="gender-female")
    WebElement  GenderFemale;
    //By GenderFemale =By.id("gender-female");


    @FindBy(id="FirstName")
    WebElement  FirstnameField;
    //By FirstnameField = By.id("FirstName");


    @FindBy(id="LastName")
    WebElement  LastnameField;
    //By LastnameField = By.id("LastName");


    @FindBy(name="DateOfBirthDay")
    WebElement  Day;
   // By Day = By.name("DateOfBirthDay");

    @FindBy(name="DateOfBirthMonth")
    WebElement  MonthD;
    //By MonthD =By.name("DateOfBirthMonth");

    @FindBy(name="DateOfBirthYear")
    WebElement  Year;
    //By Year =By.name("DateOfBirthYear");


    @FindBy(id="Email")
    WebElement  Email;
    //By Email = By.id("Email");

    @FindBy(id="Password")
    WebElement  Password;
    //By Password =By.id("Password");

    @FindBy(id="ConfirmPassword")
    WebElement  ConfirmPassword;
    //By ConfirmPassword = By.id("ConfirmPassword");


    @FindBy(xpath="//div[(text()='Your registration completed')]")
    WebElement  Registermsg;
    //By Registermsg =By.xpath("//div[(text()='Your registration completed')]");

    public void ClickonRegisterButton(){
        this.clickOnElement(this.RegisterButton);
    }

    public String VerifyFirstnameError (){
        return getTextFromElement(ErrorFirstname);
    }

    public String VerifyLastnameError(){
        return getTextFromElement(ErrorLastname);
    }

    public String VerifyEmailError(){
        return getTextFromElement(ErrorEmail);
    }

    public String VerifyPasswordError(){
        return getTextFromElement(ErrorPassword);
    }

    public String VerifyConfirmPasswordError(){
        return getTextFromElement(ErrorConfirmPassword);
    }

    public void ClickonFemale(){
        this.clickOnElement(this.GenderFemale);
    }
    public void EnterFirstname(String Firstn){

        sendTextToElement(FirstnameField,Firstn);
    }

    public void EnterLastname(String Lastn){

        sendTextToElement(LastnameField,Lastn);
    }

    public void SelectDay(String day){
        selectByValueFromDropDown(Day,day);
    }

    public void SelectMonth(String month){
        selectByValueFromDropDown(MonthD,month);
    }

    public void SelectYear(String year){
        selectByValueFromDropDown(Year,year);
    }

    public void EnterEmail(String email){

        sendTextToElement(Email,email);
    }

    public void EnterPassword(String pass){

        sendTextToElement(Password,pass);
    }

    public void EnterConfirmPassword(String confirmp){

        sendTextToElement(ConfirmPassword,confirmp);
    }

    public String VerifyRegisterSuccessfullMsg(){
        return getTextFromElement(Registermsg);
    }
}
