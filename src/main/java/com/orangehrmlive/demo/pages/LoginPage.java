package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

        //get all locators from homepage
      By userName= By.xpath("//input[@placeholder='Username']");
      By password=By.xpath("//input[@placeholder='Password']");
      By loginButton=By.xpath("//button[normalize-space()='Login']");
      By hrForAllLogo=By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
      By loginText=By.xpath("//h5[normalize-space()='Login']");



      //create appropriate methods

    /**
     *This method will enter user name
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
     * This method will click on login button
     */
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    /**
     * This method will get HR logo
     */
    public String getHRForAllLogo(){
        return getTextFromElement(hrForAllLogo);
    }
    /**
     * This method will get login text
     */
    public String getLoginText(){
        return getTextFromElement(loginText);
    }

}
