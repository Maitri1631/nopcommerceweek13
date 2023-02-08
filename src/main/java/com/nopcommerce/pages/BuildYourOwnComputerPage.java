package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public BuildYourOwnComputerPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[text()='Build your own computer']")
    WebElement Product;
    //By Product = By.xpath("//a[text()='Build your own computer']");


    @FindBy(id="product_attribute_1")
    WebElement Processer ;
    //By Processer = By.id("product_attribute_1");

    @FindBy(id="product_attribute_2")
    WebElement RAM ;
    //By RAM =By.id("product_attribute_2");

    @FindBy(id="product_attribute_3_7")
    WebElement HDD ;
    //By HDD =By.id("product_attribute_3_7");

    @FindBy(id="product_attribute_4_9")
    WebElement OS ;
    //By OS =By.id("product_attribute_4_9");

    @FindBy(id="product_attribute_5_12")
    WebElement Software;
    //By Software =By.id("product_attribute_5_12");


    @FindBy(id="add-to-cart-button-1")
    WebElement AddtoCartButton;
    //By AddtoCartButton = By.id("add-to-cart-button-1");


    @FindBy(xpath="//div[@id='bar-notification']/div/p[text()='The product has been added to your ']")
    WebElement validationmsg;
    //By validationmsg = By.xpath("//div[@id='bar-notification']/div/p[text()='The product has been added to your ']");


    public void ClickonProduct(){
        this.clickOnElement(this.Product);
    }

    public String VerifyPorductLink(){
        return getTextFromElement(Product);
    }

    public void SelectProcesser(String pro){
        selectByVisibleTextFromDropDown(Processer,pro);
    }

    public void SelectRAM(String ram){
        selectByVisibleTextFromDropDown(RAM,ram);
    }

    public void ClickonHDD(String hdd){
        this.clickOnElement(this.HDD);
    }

    public  void ClickonOS(String os){
        this.clickOnElement(this.OS);
    }

    public void ClickonSoftware(String software){
        this.clickOnElement(this.Software);
    }

    public void ClickonADdToCart(){
        this.clickOnElement(this.AddtoCartButton);
    }

    public String VerifyValidationMsg(){
        return getTextFromElement(validationmsg);
    }

    public void BuildApplication(String processor, String ram, String hdd, String os, String software){
        SelectProcesser(processor);
        SelectRAM(ram);
        ClickonHDD(hdd);
        ClickonOS(os);
        ClickonSoftware(software);

    }


}

