package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.pages.hrm.adminuser;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class adminTest extends TestBase {
    @Test()
    public void second() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "Login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();
        softAssert.assertTrue(adminuser.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(adminuser.isaddbuttonDisplay(), "admin button is  Display");
        adminuser.clickadd();
        softAssert.assertTrue(adminuser.isaddusermaDisplay(), "estrangement button is  Display");
        softAssert.assertTrue(adminuser.isadduserPageDisplay(), "user button is  Display");
        softAssert.assertTrue(adminuser.isUserNameDisplay(), "Login username is not Display");
        adminuser.setTxtUserName("Admin");
        softAssert.assertTrue(adminuser.isUserRoleDisplay(), "Login Password is not Display");
       adminuser.setDropUserRole("Admin");
       softAssert.assertTrue(adminuser.isEmpNameDisplay(), "Login Password is not Display");
        adminuser.setTxtEmployeeName("Paul");
        softAssert.assertTrue(adminuser.isSatusDisplay(), "Login Password is not Display");
        adminuser.clicked3();

        softAssert.assertTrue(adminuser.isaddbuttonDisplay(), "user button is  Display");
        softAssert.assertTrue(adminuser.isadduserPageDisplay(), "Login username is not Display");
        softAssert.assertTrue(adminuser.isadduserPageDisplay(), "Login username is not Display");
       adminuser.setdropAddUserRole();
        softAssert.assertTrue(adminuser.isAddUserPageDisplay(), "Login username is not Display");
       adminuser.setAdduserTxtEmpName("Rajkumar");
        softAssert.assertTrue(adminuser.isAddUserPageDisplay(), "Login username is not Display");
       adminuser.setAddUserName("Raja");
        softAssert.assertTrue(adminuser.isAddUserPageDisplay(), "Login username is not Display");
       adminuser.setdropAdduserStatus();
        softAssert.assertTrue(adminuser.isAddUserPageDisplay(), "Login username is not Display");
       adminuser.setAddUserPassword("raj123");
        softAssert.assertTrue(adminuser.isAddUserPageDisplay(), "Login username is not Display");
       adminuser.setAddUserConfPass("raj123");
       adminuser.clicked3();
        softAssert.assertAll();

    }
}

