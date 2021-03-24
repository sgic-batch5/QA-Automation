package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.Add;
import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Addtest extends TestBase {

    @Test(testName = "Add Designation")
    public void first() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "Login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();

        Add.clickdrecuritment();
        Add.clickdrecuritmentadd();
        Add.setfirstname("Roshany");
        Add.setmiddilename("Alaku");
        Add.setlastname("Subramaniyam");
        Add.setemail("roshanyniro96@gmail.com");
        Add.setcontactno("0774873422");
        Add.setRkeywords("selenium");
        Add.setRcomments("Orangehrm is a better website to do the automation practices");
        Add.clickrconsent();
        Add.clickrsave();
//        Add.implicitWait(8);
        Add.clickadmin();
//        Add.implicitWait(8);
        softAssert.assertAll();


    }
}
