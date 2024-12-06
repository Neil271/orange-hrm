package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By dashboard=By.xpath("//h6[normalize-space()='Dashboard']");
    By logo = By.xpath("//img[@alt='client brand banner']");
    By userProfileLogo= By.xpath("//img[@class='oxd-userdropdown-img']");
    By logoutButton=By.xpath("//a[normalize-space()='Logout']");
    By adminTab=By.xpath("//li[1]//a[1]//span[1]");

    /**
     * This method will get Dashboard message
     */
    public String getDashboardMessage(){
        return getTextFromElement(dashboard);
    }
    /**
     * This method will display logo
     */
    public boolean isDisplayed(){
        return true;
    }
    /**
     * This method will click on user profile logo
     */
    public void userProfileLogo(){
        clickOnElement(userProfileLogo);
    }
    /**
     * This method will mouse hover and click on logout
     */
    public void clickOnLogout(){
        mouseHoverToElementAndClick(logoutButton);
    }
    /**
     * This method will click on Admin Tab
     */
    public void clickOnAdminTab(){
        clickOnElement(adminTab);
    }
}
