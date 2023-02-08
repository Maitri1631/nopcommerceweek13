package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyErrorMessageWithInvalidCredentials(String username, String password){

        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username,password);
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

    @Test(dataProvider = "vaildcredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String username ,String password){
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username,password);
        String expected = "Log out";
        Assert.assertEquals(expected, loginPage.VerifyLogoutLink());
    }

    @Test(dataProvider = "vaildcredentials", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldLogOutSuccessFully(String username ,String password){
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username,password);
        loginPage.ClickonLogoutLink();
        String expected = "Log in";
        Assert.assertEquals(expected, homePage.VerifyLoginLink());
    }
}
