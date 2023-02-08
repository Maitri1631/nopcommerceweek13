package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "ico-login")
    WebElement loginLink;
    //By loginLink = By.className("ico-login");

      //@FindBy(linkText = "Register")
     // WebElement registerLink;
    By registerLink = By.linkText("Register");

    @FindBy(linkText = "nopCommerce")
     WebElement logoLink;
    //By logoLink = By.linkText("nopCommerce");

    @FindBy(linkText = "my Account Link")
     WebElement  myAccountLink;
    //By myAccountLink = By.linkText("my Account Link");

    @FindBy(linkText = "Logout Link")
     WebElement  LogOutLink;
    //By LogOutLink = By.linkText("Logout Link");

    @FindBy(linkText = "Computers")
    WebElement  Computers;
    //By Computers = By.linkText("Computers");

    @FindBy(linkText = "Digitaldownloads")
    WebElement  Digitaldownloads;
    //By Digitaldownloads = By.linkText("Digitaldownloads");

    @FindBy(linkText = "Electronics")
    WebElement  Electronics;
    //By Electronics = By.linkText("Electronics");


    @FindBy(linkText = "Apparel")
    WebElement  Apparel;
    // By Apparel = By.linkText("Apparel");

    @FindBy(linkText = "Books")
    WebElement  Books;
    //By Books = By.linkText("Books");

    @FindBy(linkText = "Jewelery")
    WebElement  Jewelery;
    //By Jewelery = By.linkText("Jewelery");

    @FindBy(linkText = "GiftCards")
    WebElement  GiftCards;
    //By GiftCards = By.linkText("GiftCards");

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
      clickOnElement(registerLink);
    }
    public void clickOnlogoLink() {
        Reporter.log("clicking on logolink " + logoLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("clicking on myaccountLink" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOutLink() {
        Reporter.log("clicking on LogOutLink" + LogOutLink.toString());
        clickOnElement(LogOutLink);
    }

    public void clickOnComputers() {
        Reporter.log("clicking on Computers" + Computers.toString());
        clickOnElement(Computers);
    }

    public void clickOnElectronics() {
        Reporter.log("clicking on Electronics" + Electronics.toString());
        clickOnElement(Electronics);
    }

    public void Apparel() {
        Reporter.log("clicking on Apparel" + Apparel.toString());
        clickOnElement(Apparel);
    }

    public void clickOnDigitaldownloads() {
        Reporter.log("clicking on Digitaldownloads" + Digitaldownloads.toString());
        clickOnElement(Digitaldownloads);
    }

    public void clickOnBooks() {
        Reporter.log("clicking on Books" + Books.toString());
        clickOnElement(Books);
    }

    public void clickOnJewelery() {
        Reporter.log("clicling on Jewelery" + Jewelery.toString());
        clickOnElement(Jewelery);
    }

    public void clickOnGiftCards() {
        Reporter.log("clicking on GiftCards" + GiftCards.toString());
        clickOnElement(GiftCards);
    }

    public String VerifyLoginLink(){
        return getTextFromElement(this.loginLink);
    }

    public String VerifyRegisterLink(){
        return getTextFromElement(this.registerLink);
    }

    public String VerifyComputersText(){
        return  getTextFromElement(this.Computers);
    }


}
