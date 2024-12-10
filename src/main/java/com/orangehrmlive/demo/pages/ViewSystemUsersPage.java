package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectUserRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successFull;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div[@role='row']/div[2]")
    WebElement resultList;

    @CacheLookup
    @FindBy(css = "div[class='oxd-table-card-cell-checkbox'] i[class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkbox;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(xpath = "//div[@role='document']")
    WebElement popUp;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement okAlert;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement oneRecordFound;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;




    /**
     *This method will verify Add User Text
     */
    public void verifyAddUserText(String expected,String msg){
        verifyText(getTextFromElement(addUserText),expected,msg);
    }

    /**
     * This method will click on search button
     */
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    /**
     * This method will select Role
     */
    public void selectRole(String key){
        mouseHoverToElementAndClick(selectUserRole);
        typeKeysAndEnter(key.split("")[0]);
    }

    /**
     * This method will enter employee name
     */
    public void enterEmployeeName(String eName){
        sendTextToElement(employeeName,eName);
    }

    /**
     * This method will enter user name
     */
    public void setUserName(String uname){
        sendTextToElement(userName,uname);
    }

    /**
     * This method will select status
     */
    public void selectStatus(String key){
        mouseHoverToElementAndClick(selectStatus);
        typeKeysAndEnter(key.split("")[0]);
    }
    /**
     * This method will verify user in result list
     */
    public void verifyUserInResultList(String expected, String msg){
        verifyText(getTextFromElement(resultList),expected,msg);
    }
    /**
     * This method will click on checkbox
     */
    public void clickOnCheckbox(){
        clickOnElement(checkbox);
    }
    /**
     * This method will click delete button
     */
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
    /**
     * This method will display pop up
     */
    public void popUpDisplay(){
        verifyThatElementIsDisplayed(popUp);
    }
    /**
     * This method will click ok on pop up
     */
    public void clickOkOnPopUP(){
        clickOnElement(okAlert);
    }
    /**
     * This method will verify 1 record found
     */
    public void verifyOneRecordFound(String expected,String msg){
       verifyText(getTextFromElement(oneRecordFound),expected,msg);
    }
    /**
     * This method will click on reset button
     */
    public void clickOnResetButton(){
        clickOnElement(resetButton);
    }


    public void verifyDeleteUserSuccessfulMessage(String expected,String msg){
        verifyText(getTextFromElement(successFull),expected,msg);
    }

    public void verifyNoUserFoundedMessage(String expected,String msg){
        verifyText(getTextFromElement(successFull),expected,msg);
    }
}
