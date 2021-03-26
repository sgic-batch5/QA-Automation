package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.pages.hrm.RequirmentPage;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReqTest extends TestBase {

    @Test
    public void first() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "Login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();


        RequirmentPage.clickReq();
        softAssert.assertTrue(RequirmentPage.isCondidate(),"ithu illaida");
        RequirmentPage.clickCondate();
        RequirmentPage.clickAdmin();
        RequirmentPage.setUser();
        RequirmentPage.setUsername();
        RequirmentPage.clickAdd();
        RequirmentPage.setRoleI();
        RequirmentPage.setEmpo();
        RequirmentPage.setName();
        RequirmentPage.setStaus();



        softAssert.assertAll();


    }
}
