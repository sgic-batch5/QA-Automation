package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class adminuser extends PageBase {
    public SoftAssert softAssert;

    //private static final Logger LOGGER = Logger.getLogger(adduser.class);

     private static By btnadmin = By.id("menu_admin_viewAdminModule");
     private static By btnauserMa = By.id("menu_admin_UserManagement");
     private static By btnuser = By.id("menu_admin_viewSystemUsers");
     private static By adminhed = By.id("systemUser-information");
     private static By TxtUserName = By.id("searchSystemUser_userName");
     private static By dropUserRole = By.id("searchSystemUser_userType");
     private static By txtEmployeeName = By.id("searchSystemUser_employeeName_empName");
     private static By dropStatus = By.id("searchSystemUser_status");

     private static By searchBtn= By.id("searchBtn");
     private static By reset = By.id("reset");
     private static By btnAdd = By.id("btnAdd");
    private static By dropAddUserRole = By.className("formSelect valid");
    private static By AdduserTxtEmpName = By.id("systemUser_employeeName_empName");
    private static By AddUserName = By.id("systemUser_userName");
    private static By dropAdduserStatus = By.className("formSelect valid");
    private static By AddUserPassword = By.id("systemUser_password");
    private static By AddUserConfPass = By.id("systemUser_confirmPassword");
    private static By btnAdd2 = By.className("btnSave");



    public static boolean isadduserPageDisplay() {

        return getDriver().findElement(btnadmin).isDisplayed();


    }
    public static boolean isadduserPageDisplay1() {

        return getDriver().findElement(btnuser).isDisplayed();


    }

    public static boolean isaddbuttonDisplay() {

        return getDriver().findElement(btnadmin).isDisplayed();
    }
    public static boolean isaddusermaDisplay() {

        return getDriver().findElement(btnauserMa).isDisplayed();
    }
    public static boolean isadduserDisplay() {

        return getDriver().findElement(btnuser).isDisplayed();
    }
    //public static void setPassword(String password) {
        //getDriver().findElement(txtPassword).sendKeys(password);
    //}

    public static void clickadd() {
        getDriver().findElement(btnadmin).click();
    }
    public static void clickadd1() {
        getDriver().findElement(btnauserMa).click();
    }
    //public static boolean isLoginAlertDisplay() {
     //   return getDriver().findElement(alert).isDisplayed();
    //}
    public static void clickadd2() {
        getDriver().findElement(btnuser).click();
    }
    public static boolean isaddPageDisplay() {

        return getDriver().findElement(btnAdd).isDisplayed();


    }
    public static void clicked3() {
          getDriver().findElement(btnAdd).click();
    }
    public static boolean isAddUserPageDisplay() {

        return getDriver().findElement(btnAdd).isDisplayed();


    }

    public static boolean isUserNameDisplay() {

        return getDriver().findElement(TxtUserName).isDisplayed();
    }
    public static Boolean isUserRoleDisplay() {

        return getDriver().findElement(dropUserRole).isDisplayed();


    }
    public static boolean isEmpNameDisplay() {

        return getDriver().findElement(txtEmployeeName).isDisplayed();
    }
    public static boolean isSatusDisplay() {

        return getDriver().findElement(dropStatus).isDisplayed();
    }

    public static void setTxtUserName(String userName) {

        getDriver().findElement(TxtUserName).sendKeys(userName);
    }


    /**
     * @param Admin
     */
    public static void setDropUserRole(String Admin) {

        getDriver().findElement(dropUserRole).sendKeys(Admin);
    }
    public static void setTxtEmployeeName(String Paul) {
        getDriver().findElement(txtEmployeeName).sendKeys(Paul);
    }
    /**public static void setDropStatus( ) {
        getDriver().findElement(dropUserRole).sendKeys();
    }

    public static void clickSearch() {
        getDriver().findElement(searchBtn).click();
    }**/

// Add user page




    public static void setdropAddUserRole() {

        getDriver().findElement(dropAddUserRole).sendKeys("ESS");
    }


    public static void setAdduserTxtEmpName(String  Rajakumar) {

        getDriver().findElement(AdduserTxtEmpName).sendKeys("Rajakumar");
    }
    public static void setAddUserName(String  Raja) {

        getDriver().findElement(AddUserName).sendKeys("Raja");
    }


    public static void setdropAdduserStatus() {

        getDriver().findElement(dropAdduserStatus).sendKeys("Enabled");
    }
    public static void setAddUserPassword(String  raji123) {

        getDriver().findElement(AddUserPassword).sendKeys("raji123");
    }
    public static void setAddUserConfPass(String  raji123) {

        getDriver().findElement(AddUserConfPass ).sendKeys("raji123");
    }


}
