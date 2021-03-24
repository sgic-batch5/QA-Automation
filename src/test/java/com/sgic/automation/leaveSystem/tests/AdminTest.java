package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.AdminPage;
import com.sgic.automation.leaveSystem.pages.hrm.JobTitleTab;
import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdminTest extends TestBase {
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
        AdminPage.ClickAdmin();
        AdminPage.ClickJob();
        AdminPage.ClickEmpSta();
//        AdminPage.ClickJobTitle();
//        AdminPage.ClickPayGrades();
//        AdminPage.ClickJobCategory();

//        AdminPage.ClickWorkShift();
        JobTitleTab.ClickAdd();
//        JobTitleTab.setJobTitle("PRGS");
//        JobTitleTab.setJobDes(("QualityAssurance"));
//        JobTitleTab.setNote(("HI,It works Prgs!!"));
//        JobTitleTab.ClickChoose();
//        JobTitleTab.ClickFile();
//        JobTitleTab.setName("PRGS");
        JobTitleTab.setEmpSta("PRGS");
//        JobTitleTab.setJobCate("PRGS");
//        JobTitleTab.setWorkShift("PRGS");
        JobTitleTab.ClickSave();


        softAssert.assertAll();


    }
}
