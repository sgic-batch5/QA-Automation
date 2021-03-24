package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.Adminpage;
import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.pages.hrm.recruitment;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testrecruitment extends TestBase {
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
        softAssert.assertTrue(Adminpage.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(Adminpage.isaddbuttonDisplay(), "Login button is not Display");
        Adminpage.clickadd();

        recruitment.clickadd3();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd4();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd5();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd6();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd7();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd8();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd9();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd10();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd11();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd12();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd13();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd14();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd15();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");
        recruitment.clickadd16();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");

        recruitment.clickadd17();
        softAssert.assertTrue(recruitment.isadduserPageDisplay(), "add Page is not Display");
        softAssert.assertTrue(recruitment.isaddbuttonDisplay(), "Login button is not Display");



        softAssert.assertAll();

    }
}


