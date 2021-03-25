package com.sgic.automation.leaveSystem.tests;


import com.sgic.automation.leaveSystem.pages.hrm.AddUser;
import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class addtest extends TestBase {
    @Test(testName = "Add Designation", dataProviderClass = TestData.class,dataProvider = "Login")
    public void first(String username,String pass) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "Login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();


        AddUser.clickrecruitment();
        AddUser.clickrecruitmentAdd();

        softAssert.assertTrue(AddUser.isFirstNameDisplay(), "AddUser Firstname is not Display");
        AddUser.setAddFirstName("S");

        softAssert.assertTrue(AddUser.isMiddleNameDisplay(), "AddUser Middlename is not Display");
        AddUser.setAddMiddleName("Madhu");

        softAssert.assertTrue(AddUser.isLastNameDisplay(), "AddUser LastName is not Display");
        AddUser.setAddLastName("mitha");


        softAssert.assertAll();


    }
}
