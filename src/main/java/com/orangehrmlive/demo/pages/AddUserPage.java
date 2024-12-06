package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class AddUserPage extends Utility {

    By addUserText=By.xpath("//h6[normalize-space()='Add User']");
    By selectRole=By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[contains(text(),'Admin')]");
    //By =By.xpath("//input[@placeholder='Type for hints...']");
    By employeeName=RelativeLocator.with(By.tagName("input")).below(By.xpath("//label[normalize-space()='Employee Name']"));
    By userName=RelativeLocator.with(By.tagName("input")).below(By.xpath("//label[normalize-space()='Username']"));
    By password=RelativeLocator.with(By.tagName("input")).below(By.xpath("//label[normalize-space()='Password']"));
    By confirmPassword=RelativeLocator.with(By.tagName("input")).below(By.xpath("//label[normalize-space()='Confirm Password']"));
    By saveButton=By.xpath("//button[normalize-space()='Save']");
    By successMessage = By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By noRecordFound=By.xpath("//div[@class='oxd-toast oxd-toast--info oxd-toast-container--toast']");
    By resultList=By.cssSelector("span[class='oxd-text oxd-text--span']");
    By dropDown=By.xpath("//div[@class='oxd-select-text oxd-select-text--active oxd-select-text--error']");

    /**
     *This method will verify Add User Text
     */
    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }
    /**
     * This method will select Role
     */
    public void selectRoleAdmin(String options){
        selectByVisibleTextFromDropDown(selectRole,options);
    }
    /**
     * This method will click on dropdown
     */
    public void selectDropDown(){
        clickOnElement(dropDown);
    }

    /**
     * This method will enter employee name
     */
    public void enterEmployeeName(String eName){
        sendTextToElement(employeeName,eName);
    }
    /**
     * This method will enter username
     */
   public void enterUserName(String uName){
     sendTextToElement(userName,uName);
    }
    /**
     * This method will enter password
     */
    public void enterPassword(String pass){
        sendTextToElement(password,pass);
    }
    /**
     * This method will enter confirm password
     */
    public void enterConfirmPassword(String cPass){
        sendTextToElement(confirmPassword,cPass);
    }

    /**
     * This method will click on save button
     */
    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }

    /**
     * This method will verify successfully saved message
     */
    public String verifySuccessfullySavedMessage(){
        return getTextFromElement(successMessage);
    }
    /**
     * This method will verify No user found
     */
    public String verifyNoUserFound(){
        return getTextFromElement(noRecordFound);
    }
    /**
     * This method will verify user in result list
     */
    public List<WebElement> verifyUserInResultList(){
         return findElements(resultList);
    }


    /**
     * This method will click on search button
     */
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }


    public void selectUserRoleAsAdmin(){
        selectByVisibleTextFromDropDown(selectRole,"Admin");
        //clickOnElement(selectRole);
        //clickOnElement(By.xpath("//div[contains(text(),'Admin')]"));
       /* List<WebElement> roles = findElements(selectRole);
        for (WebElement role:roles){
            System.out.println(role.getText());
            if(role.getText().equals("Admin")){
                role.click();
                break;
            }
        }*/

    }
}
