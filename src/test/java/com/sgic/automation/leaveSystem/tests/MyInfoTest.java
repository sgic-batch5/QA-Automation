package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.pages.hrm.MyInfoPage;
import com.sgic.automation.leaveSystem.testData.TestData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyInfoTest extends TestBase {
    @Test(testName = "MyInfoTest", dataProviderClass = TestData.class, dataProvider = "Login")
    public void first(String username, String pass) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "Login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();
        softAssert.assertTrue(MyInfoPage.isHDRDisplay(),"Hdr is not display");
        MyInfoPage.clickInfo();
        softAssert.assertTrue(MyInfoPage.iseditDisplay(), "in here edit is display");
        MyInfoPage.clickedit();
        softAssert.assertTrue(MyInfoPage.isfullNameDisplay(),"Full name is not display");
        MyInfoPage.clearName();
        MyInfoPage.setfullName("Sasikala");
        softAssert.assertTrue(MyInfoPage.isMiddleNameDisplay(),"middle name is displayed");
        MyInfoPage.setmiddlename("kala");
        softAssert.assertTrue(MyInfoPage.isLastNameDisplay(),"lastname is displayed");
        MyInfoPage.setHdrlastname("sasi");
        softAssert.assertTrue(MyInfoPage.isemployeeidDisplay(),"empid displayed");
        MyInfoPage.sethdremployeeid("123");
        softAssert.assertTrue(MyInfoPage.isotheridDisplay(),"Otherid is displayed");
        MyInfoPage.setotherid("001");
        softAssert.assertTrue(MyInfoPage.islicencenumDisplay(),"licence number is displayed");
        MyInfoPage.setlicencenum("123456");
        softAssert.assertTrue(MyInfoPage.isdateDisplay(),"date displayed");
        MyInfoPage.setdate("2021.03.22");
        softAssert.assertTrue(MyInfoPage.isssnNumberDisplay(),"ssnNumber displayed");
        MyInfoPage.setssnNumber("456456");
        softAssert.assertTrue(MyInfoPage.issinNumberDisplay(),"sinNumber displayed");
        MyInfoPage.setsinNumber("111111");
        softAssert.assertTrue(MyInfoPage.isgenderDisplay(),"gender dispalyed");
        MyInfoPage.clickgender();
        softAssert.assertTrue(MyInfoPage.isHDRadminDisplay(),"admin screen visible");
        MyInfoPage.clickadmin();
        softAssert.assertTrue(MyInfoPage.isHDRusermanagementDisplay(),"usermanagement screnn visible");
        MyInfoPage.clickusermanagement();

       softAssert.assertAll();

    }
}
