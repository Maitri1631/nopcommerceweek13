package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homepage ;
    RegisterPage registerPage ;
    @BeforeMethod
    public void inIt(){
        homepage = new HomePage();
        registerPage  = new RegisterPage();
    }


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homepage.clickOnRegisterLink();
        String expected = "Register";
        Assert.assertEquals(expected, homepage.VerifyRegisterLink());
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homepage.clickOnRegisterLink();
        registerPage.ClickonRegisterButton();
        String expectedFirstname = "First name is required.";
        Assert.assertEquals(expectedFirstname, registerPage.VerifyFirstnameError());

        String expectedLastname ="Last name is required.";
        Assert.assertEquals(expectedLastname, registerPage.VerifyLastnameError());

        String expectedEmail="Email is required.";
        Assert.assertEquals(expectedEmail, registerPage.VerifyEmailError());

        String expectedPassword="Password is required.";
        Assert.assertEquals(expectedPassword, registerPage.VerifyPasswordError());

        String expectedConfirmPass ="Password is required.";
        Assert.assertEquals(expectedConfirmPass, registerPage.VerifyConfirmPasswordError());
    }
    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homepage.clickOnRegisterLink();
        registerPage.ClickonFemale();
        registerPage.EnterFirstname("Monika");
        registerPage.EnterLastname("Patel");
        registerPage.SelectDay("15");
        registerPage.SelectMonth("4");
        registerPage.SelectYear("1996");
        registerPage.EnterEmail("monikapatel16@gmail.com");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickonRegisterButton();
        String expected ="Your registration completed";
        Assert.assertEquals(expected, registerPage.VerifyRegisterSuccessfullMsg());
    }
}
