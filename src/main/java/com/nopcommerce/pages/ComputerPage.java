package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[@class='listbox']//a[@href='/desktops']")
    WebElement Desktop;
    //By Desktop = By.xpath("//div[@class='listbox']//a[@href='/desktops']");

    @FindBy(xpath="//div[@class='listbox']//a[@href='/notebooks']")
    WebElement NoteBook;
    //By NoteBook = By.xpath("//div[@class='listbox']//a[@href='/notebooks']");


    @FindBy(xpath="//div[@class='listbox']//a[@href='/software']")
    WebElement Software;
    //By Software = By.xpath("//div[@class='listbox']//a[@href='/software']");

    public void ClickonDesktop(){
        this.clickOnElement(this.Desktop);
    }

    public void ClickOnNoteBook(){
        this.clickOnElement(this.NoteBook);
    }

    public  void ClickonSoftware(){
        this.clickOnElement(this.Software);
    }

    public String VerifyDesktoplink(){
        return getTextFromElement(Desktop);
    }

}
