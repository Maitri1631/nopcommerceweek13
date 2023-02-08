package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//select[@id='products-orderby']/option[3]")
    WebElement SortValue;
   // By SortBy = By.id("products-orderby");

    //By SortValue = By.xpath("//select[@id='products-orderby']/option[3]");

    //By Display =By.id("products-pagesize");

    @FindBy(xpath="//select[@id='products-pagesize']/option[2]")
    WebElement Displayvalue;
    //By Displayvalue = By.xpath("//select[@id='products-pagesize']/option[2]");

    @FindBy(xpath="//div[@class='product-viewmode']/a[2]")
    WebElement List;
    //By List = By.xpath("//div[@class='product-viewmode']/a[2]");

    @FindBy(xpath="//div[@class='product-viewmode']/a[2]")
    WebElement Grid;
    //By Grid = By.xpath("//div[@class='product-viewmode']/a[2]");

    public void SelectValueSortBy(String sort){
        selectByVisibleTextFromDropDown(SortValue,sort);
    }

    public void SelectDisplayValue(String display){
        selectByVisibleTextFromDropDown(Displayvalue,display);
    }

    public void ClickonListIcon(){
        this.clickOnElement(this.List);
    }

    public void ClickonGridIcon(){
        this.clickOnElement(this.Grid);
    }
}