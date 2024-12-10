package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement errorMessage;


    //create appropriate methods

    /**
     * This method will enter user name
     */
    public void enterUserName(String uName) {
        CustomListeners.test.log(Status.PASS, "Enter user name into " + userName.getTagName()+" Element.");
        sendTextToElement(userName, uName);
    }

    /**
     * This method will enter password
     */
    public void enterPassword(String pass) {
        CustomListeners.test.log(Status.PASS, "Enter user password into " + password.getTagName()+" Element.");
        sendTextToElement(password, pass);
    }

    /**
     * This method will click on login button
     */
    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS,"Click on " + userName.toString()+" Element.");
        clickOnElement(loginButton);
    }

    /**
     * This method will verify login text panel display
     */
    public void verifyLoginPanelIsDisplayed(String expected, String msg) {
        CustomListeners.test.log(Status.PASS,"Verify Login text panel displayed" + userName.toString());
        verifyThatTextIsDisplayed(loginText, msg);
    }

    /**
     * This method will verify error message
     */
    public void verifyErrorMessage(String expected, String msg) {
        verifyText(getTextFromElement(errorMessage), expected, msg);
    }

}
