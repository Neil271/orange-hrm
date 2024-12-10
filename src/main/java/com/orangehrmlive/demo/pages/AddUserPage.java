package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(css = "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successFull;

    /**
     * This method will verify Add User Text
     */
    public void verifyAddUserText(String expected, String msg) {
        CustomListeners.test.log(Status.PASS,"Verify Login text panel displayed" + addUserText.toString());
        verifyText(getTextFromElement(addUserText), expected, msg);
    }

    /**
     * This method will select Role
     */
    public void selectRoleAdmin(String key) {
        mouseHoverToElementAndClick(selectRole);
        typeKeysAndEnter(key.split("")[0]);
    }

    /**
     * This method will enter employee name
     */
    public void enterEmployeeName(String eName) {
        CustomListeners.test.log(Status.PASS, "Enter user name into " + employeeName.getTagName()+" Element.");
        sendTextToElement(employeeName, eName);
    }

    /**
     * This method will enter username
     */
    public void enterUserName(String uName) {
        CustomListeners.test.log(Status.PASS, "Enter user name into " + userName.getTagName()+" Element.");
        sendTextToElement(userName, uName);
    }

    /**
     * This method will select status
     */
    public void selectStatus(String key) {
        mouseHoverToElementAndClick(selectStatus);
        typeKeysAndEnter(key.split("")[0]);
    }


    /**
     * This method will enter password
     */
    public void enterPassword(String pass) {
        CustomListeners.test.log(Status.PASS, "Enter user password into " + password.getTagName()+" Element.");
        sendTextToElement(password, pass);
    }


    /**
     * This method will enter confirm password
     */
    public void enterConfirmPassword(String cPass) {
        CustomListeners.test.log(Status.PASS, "Enter user password into " + confirmPassword.getTagName()+" Element.");
        sendTextToElement(confirmPassword, cPass);
    }

    /**
     * This method will click on save button
     */
    public void clickOnSaveButton() {
        CustomListeners.test.log(Status.PASS,"Click on " + userName.toString()+" Element.");
        clickOnElement(saveButton);
    }


    /*public String getSuccessfulMessage() {
        return getTextFromElement(successFull);
    }*/


    public void verifyAddUserSuccessfulMessage(String expected,String msg){
        CustomListeners.test.log(Status.PASS,"Verify user added successfully" + userName.toString());
        verifyText(getTextFromElement(successFull),expected,msg);
    }


    /*/**
     * This method will click on dropdown
     *//*
    public void selectDropDown(){
        clickOnElement(dropDown);
    }
*/
}
