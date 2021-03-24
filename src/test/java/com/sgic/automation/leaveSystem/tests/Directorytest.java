package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.Directorypage;
import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.lang.model.element.Name;

public class Directorytest extends TestBase {
    @Test(testName = "DirectoryTest", dataProviderClass = TestData.class,dataProvider = "Login")
    public void first(String username,String pass) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();
        softAssert.assertTrue(Directorypage.isDirectoryPageDisplay(), " Directory is not Display");
        Directorypage.ClickDirectory();

        softAssert.assertAll();
    }
    }
