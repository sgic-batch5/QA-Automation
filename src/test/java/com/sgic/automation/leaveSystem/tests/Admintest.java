package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.AdminPage;
import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.xmlbeans.UserType;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Admintest extends TestBase {
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
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd1();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd3();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd4();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd5();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd6();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd7();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd8();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd9();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd10();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd11();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd12();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd13();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd14();
        softAssert.assertTrue(AdminPage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(AdminPage.isaddbuttonDisplay(), "Login button is not Display");
        AdminPage.clickadd15();

        softAssert.assertAll();

    }
}

