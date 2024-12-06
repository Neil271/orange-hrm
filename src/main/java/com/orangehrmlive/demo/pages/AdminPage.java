package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By systemUsers=By.xpath("//h5[normalize-space()='System Users']");
    By addButton=By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");


    /**
     *This method this verify System Users Tex
     */

    public String verifySystemUsersText(){
        return getTextFromElement(systemUsers);
    }
    /**
     * This method will click on Add button
     */
    public void clickOnAddButton(){
        clickOnElement(addButton);
    }



}
