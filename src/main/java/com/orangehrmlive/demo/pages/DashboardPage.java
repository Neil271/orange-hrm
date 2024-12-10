package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminTab;





    /**
     * This method will get Dashboard message
     */
    public void verifyDashboardMessage(String expectedText, String msg ) {
        verifyText(getTextFromElement(dashboard), expectedText, msg);
    }

    /**
     * This method will verify logo is display
     */
    public void verifyLogoIsDisplayed(){
        verifyThatElementIsDisplayed(logo);
    }
    /**
     * This method will click on user profile logo
     */
    public void userProfileLogo() {
        clickOnElement(userProfileLogo);
    }
    /**
     * This method will mouse hover and click on logout
     */
    public void clickOnLogout() {
        mouseHoverToElementAndClick(logoutButton);
    }
    /**
     * This method will click on Admin Tab
     */
    public void clickOnAdminTab() {
        clickOnElement(adminTab);
    }
}
