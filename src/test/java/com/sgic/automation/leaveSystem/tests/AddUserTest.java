package com.sgic.automation.leaveSystem.tests;


import com.sgic.automation.leaveSystem.pages.hrm.AddUserPage;
import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.pages.hrm.RecruitmentPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AddUserTest extends TestBase {
    @Test(testName = "Add Designation", dataProviderClass = TestData.class,dataProvider = "Login")
    public void first(String username,String pass){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "Login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();

        AddUserPage.clickAdmin();
        AddUserPage.isUserMngDisplay();
       // AddUserPage.clickUser();
        AddUserPage.clickAdd();
        AddUserPage.isAddUserHeadDisplay();
        AddUserPage.isEmpNameDisplay();
        AddUserPage.setTxtEmpName("Thevaki");
        AddUserPage.isUsrNameDisplay();
        AddUserPage.setTxtUsrName("Mala");
        AddUserPage.isPassWdDisplay();
        AddUserPage.setTxtPwd("Thevaki12@#");
        AddUserPage.isConPassWdDisplay();
        AddUserPage.setTxtConPwd("Thevaki12@#");
        AddUserPage.isBtnSaveDisplay();
        AddUserPage.clickSave();
        AddUserPage.isBtnCnlDisplay();
        AddUserPage.clkCancel();
    }
}
