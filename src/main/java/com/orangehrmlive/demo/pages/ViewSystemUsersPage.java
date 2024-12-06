package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    //Find locators
    By checkbox=By.cssSelector("div[class='oxd-table-card-cell-checkbox'] i[class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButton=By.cssSelector("//div[@class='orangehrm-container']//button[1]");
    By okAlert=By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");

    //Methods

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
     * This method will click ok on pop up
     */
    public void clickOkOnPopUP(){
        acceptAlert();
    }






}
