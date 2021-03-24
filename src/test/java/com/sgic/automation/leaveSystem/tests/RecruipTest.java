package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.pages.hrm.RecruitmentPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RecruipTest extends TestBase {
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

        RecruitmentPage.clickRecruitment();
        RecruitmentPage.clickbtnCandidates();
        RecruitmentPage.setCandidatesName("roshany");
        RecruitmentPage.setKeywords("Theepi");
        RecruitmentPage.clickbtnAdd();
        RecruitmentPage.setFirstName("Theepika");
        RecruitmentPage.setMiddleName("Thanga");






        softAssert.assertAll();





    }


}
