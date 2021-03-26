package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AddUserPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(RecruitmentPage.class);

    private static By BtnAdmin = By.id("menu_admin_viewAdminModule");
    private static By UserMng = By.id("menu_admin_UserManagement");
   // private static By User = By.id("menu_admin_viewSystemUsers");
    private static By BtnAdd = By.id("btnAdd");
    private static By AddUserHead = By.id("UserHeading");
    private static By txtEmpName = By.id("systemUser_employeeName_empName");
    private static By txtUsrName = By.id("systemUser_userName");
    private static By txtPwd = By.id("systemUser_password");
    private static By txtConPwd = By.id("systemUser_confirmPassword");
    private static By BtnSave = By.id("btnSave");
    private static By BtnCancel = By.id("btnCancel");







    public static void clickAdmin() {
        getDriver().findElement(BtnAdmin).click();
    }
    public static boolean isUserMngDisplay(){

        return getDriver().findElement(UserMng).isDisplayed();
    }
  //  public static void clickUser() {
   //     getDriver().findElement(User).click();
   // }

    public static void clickAdd() {
        getDriver().findElement(BtnAdd).click();
    }
    public static boolean isAddUserHeadDisplay(){

        return getDriver().findElement(AddUserHead).isDisplayed();
    }
    public static boolean isEmpNameDisplay(){

        return getDriver().findElement(txtEmpName).isDisplayed();
    }
    public static void setTxtEmpName(String EmpName) {

        getDriver().findElement(txtEmpName).sendKeys(EmpName);
    }

    public static boolean isUsrNameDisplay(){

        return getDriver().findElement(txtUsrName).isDisplayed();
    }
    public static void setTxtUsrName(String UsrName) {

        getDriver().findElement(txtUsrName).sendKeys(UsrName);
    }
    public static boolean isPassWdDisplay(){

        return getDriver().findElement(txtPwd).isDisplayed();
    }
    public static void setTxtPwd(String Pwd) {

        getDriver().findElement(txtPwd).sendKeys(Pwd);
    }
    public static boolean isConPassWdDisplay(){

        return getDriver().findElement(txtConPwd).isDisplayed();
    }
    public static void setTxtConPwd(String ConPwd) {

        getDriver().findElement(txtConPwd).sendKeys(ConPwd);
    }
    public static boolean isBtnSaveDisplay(){

        return getDriver().findElement(BtnSave).isDisplayed();
    }
    public static void clickSave() {
        getDriver().findElement(BtnSave).click();
    }
    public static boolean isBtnCnlDisplay(){

        return getDriver().findElement(BtnCancel).isDisplayed();
    }
    public static void clkCancel() {
        getDriver().findElement(BtnCancel).click();
    }
}
