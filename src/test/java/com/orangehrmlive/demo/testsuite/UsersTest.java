package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class UsersTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    AdminPage adminPage;
    AddUserPage addUserPage;
    ViewSystemUsersPage viewSystemUsersPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
        viewSystemUsersPage = new ViewSystemUsersPage();

    }


    @Test(groups = {"sanity"}, dataProvider = "AddUser", dataProviderClass = TestData.class)
    public void adminShouldAddUserSuccessFully(String username, String userRole, String employeeName, String status) {
        // Enter username
        //loginPage.enterUserName("Admin");
        loginPage.enterUserName("Admin");

        //   Enter password
        loginPage.enterPassword("admin123");

        //   Click on Login Button
        loginPage.clickOnLoginButton();

        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();

        //Verify "System Users" Text
        adminPage.verifySystemUsersText("System Users", "System Users text not displayed");

        //click On "Add" button
        adminPage.clickOnAddButton();

        //Verify "Add User" Text
        addUserPage.verifyAddUserText("Add User", "User not added");

        //Select User Role "Admin"
        addUserPage.selectRoleAdmin(userRole);

        //enter Employee Name "Ananya Dash"
        addUserPage.enterEmployeeName(employeeName);

        //enter Username
        addUserPage.enterUserName(username);

        //Select status "Disable"
        addUserPage.selectStatus(status);

        //enter psaaword
        addUserPage.enterPassword("Payal123@");

        //enter Confirm Password
        addUserPage.enterConfirmPassword("Payal123@");

        //click On "Save" Button
        addUserPage.clickOnSaveButton();

        //verify message "Successfully Saved"
        addUserPage.verifyAddUserSuccessfulMessage("Successfully Saved", "Message is not displayed");

    }

    @Test(groups = {"smoke"})
    public void searchTheUserCreatedAndVerifyIt() {

        //	Login to Application
        // Enter username
        loginPage.enterUserName("Admin");

        //   Enter password
        loginPage.enterPassword("admin123");

        //   Click on Login Button
        loginPage.clickOnLoginButton();

        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();

        //Verify "System Users" Text
        //adminPage.verifySystemUsersText("System Users","System Users text not displayed");

        //	Enter Username
        viewSystemUsersPage.setUserName("Payal1");

        //	Select User Role
        viewSystemUsersPage.selectRole("Admin");

        //	Select Satatus
        viewSystemUsersPage.selectStatus("Disable");

        //	Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();
        //Verify the User should be in Result list.
        viewSystemUsersPage.verifyUserInResultList("Payal1", "User not found");
    }

    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        //	Login to Application
        // Enter username
        loginPage.enterUserName("Admin");

        //   Enter password
        loginPage.enterPassword("admin123");

        //   Click on Login Button
        loginPage.clickOnLoginButton();

        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();

        //Verify "System Users" Text
        //adminPage.verifySystemUsersText("System Users","System Users text not displayed");

        //	Enter Username
        viewSystemUsersPage.setUserName("Payal1");

        //	Select User Role
        viewSystemUsersPage.selectRole("Admin");

        //	Select Satatus
        viewSystemUsersPage.selectStatus("Disable");

        //	Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();

        //	Verify the User should be in Result list.
       /* String actualUser = viewSystemUsersPage.verifyUserInResultList();
        String expectedUser = "neel1";
        verifyText(actualUser, expectedUser, "User not found");*/
        viewSystemUsersPage.verifyUserInResultList("Payal1", "User not found");

        //	Click on Check box
        viewSystemUsersPage.clickOnCheckbox();

        //	Click on Delete Button
        viewSystemUsersPage.clickOnDeleteButton();

        //	Popup will display
        viewSystemUsersPage.popUpDisplay();

        //	Click on Ok Button on Popup
        viewSystemUsersPage.clickOkOnPopUP();

        //	verify message "Successfully Deleted"
        viewSystemUsersPage.verifyDeleteUserSuccessfulMessage("Successfully Deleted", "Message is not displayed");

    }

    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        //	Login to Application
        // Enter username
        loginPage.enterUserName("Admin");

        //   Enter password
        loginPage.enterPassword("admin123");

        //   Click on Login Button
        loginPage.clickOnLoginButton();

        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();

        //Verify "System Users" Text
        adminPage.verifySystemUsersText("System Users", "System Users text not displayed");

        //	Enter Username
        viewSystemUsersPage.setUserName("Payal1");

        //	Select User Role
        viewSystemUsersPage.selectRole("Admin");

        //	Select Satatus
        viewSystemUsersPage.selectStatus("Disable");

        //	Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();

        //	verify message "No Records Found"
        viewSystemUsersPage.verifyNoUserFoundedMessage("No Records Found", "Message is not displayed");

        //verify message "(1) Record Found"
        viewSystemUsersPage.verifyOneRecordFound("(1) Record Found", "Message not displayed");

//        //Verify username <username>
//        String expectedText="username";
//        String actualText= viewSystemUsersPage.verifyUserNameTag();
//        verifyText(actualText,expectedText,"Tag not displayed");


        //Click on Reset Tab
        viewSystemUsersPage.clickOnResetButton();
    }

}