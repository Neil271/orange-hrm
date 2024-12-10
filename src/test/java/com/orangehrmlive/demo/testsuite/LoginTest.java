package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }


    @Test(groups = {"sanity"})
    public void verifyUserShouldLoginSuccessFully() {
        //Enter username
        loginPage.enterUserName("Admin");

        //Enter password
        loginPage.enterPassword("admin123");

        //Click on Login Button
        loginPage.clickOnLoginButton();

        //Verify "Dashboard" Message
        dashboardPage.verifyDashboardMessage("Dashboard", "Dashboard message not displayed");
    }

    @Test(groups = {"smoke"})
    public void verifyThatTheLogoDisplayOnHomePage() {

        //Login To The application
        //Enter username
        loginPage.enterUserName("Admin");

        //Enter password
        loginPage.enterPassword("admin123");

        //Click on Login Button
        loginPage.clickOnLoginButton();

        //Verify Logo is Displayed
        dashboardPage.verifyLogoIsDisplayed();
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() {

        //Login To The application
        //Enter username
        loginPage.enterUserName("Admin");

        //Enter password
        loginPage.enterPassword("admin123");

        //Click on Login Button
        loginPage.clickOnLoginButton();

        //Click on User Profile logo
        dashboardPage.userProfileLogo();

        //Mouse hover on "Logout" and click
        dashboardPage.clickOnLogout();

        //Verify the text "Login Panel" is displayed
        // loginPage.verifyLoginPanelIsDisplayed("Login Panel", "login panel not displayed");

    }

    @Test(groups = {"regression"},dataProvider = "inValidLoginCredentials", dataProviderClass = TestData.class)
    public void verifyErrorMessageWithInvalidCredentials(String userName,String password) {

        //Enter username <username>
        loginPage.enterUserName(userName);

        //Enter password <password>
        loginPage.enterPassword(password);

        //Click on Login Button
        loginPage.clickOnLoginButton();

        //Verify Error message <errorMessage>
        loginPage.verifyErrorMessage("Invalid credentials","User not logged in");
    }
}