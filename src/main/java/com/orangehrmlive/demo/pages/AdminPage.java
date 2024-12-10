package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsers;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement addButton;


    /**
     *This method this verify System Users Tex
     */

    public void verifySystemUsersText(String expected,String msg){
        CustomListeners.test.log(Status.PASS,"Verify system user text displayed" + systemUsers.toString());
       verifyText(getTextFromElement(systemUsers),expected,msg);
    }
    /**
     * This method will click on Add button
     */
    public void clickOnAddButton(){
        CustomListeners.test.log(Status.PASS,"Click on " + systemUsers.toString()+" Element.");
        clickOnElement(addButton);
    }
}
