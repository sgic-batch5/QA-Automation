package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MyinfoPage extends PageBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By hdrLogin = By.id("logInPanelHeading");
    private static By txtUserName = By.id("txtUsername");
    private static By txtPassword = By.id("txtPassword");
    private static By btnLogin = By.id("btnLogin");
    private static By myinfo = By.id("menu_pim_viewMyDetails");
    private static By edit = By.id("btnSave");
    private static By fullname = By.id("personal_txtEmpFirstName");

    public static boolean isLoginPageDisplay() {
        return getDriver().findElement(hdrLogin).isDisplayed();
    }

    public static boolean isUserNameDisplay() {
        return getDriver().findElement(txtUserName).isDisplayed();
    }

    public static boolean isPasswordDisplay() {
        return getDriver().findElement(txtPassword).isDisplayed();
    }

    public static boolean isMyinfoPageDisplay() {
        return getDriver().findElement(myinfo).isDisplayed();
    }
    public static boolean isEditbuttonDisplay() {
        return getDriver().findElement(edit).isDisplayed();
    }
    public static boolean isFullNameDisplay() {
        return getDriver().findElement(myinfo).isDisplayed();
    }


    public static void setUserName(String userName) {
        getDriver().findElement(txtUserName).sendKeys(userName);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static void clickMyInfo() {
        getDriver().findElement(myinfo).click();
    }
    public static void clickEditbutton() {
        getDriver().findElement(edit).click();
    }
    public static void setFullName(String Myname) {
        getDriver().findElement(fullname).sendKeys(Myname);
    }
    public static void clickEditbutton() {
        getDriver().findElement(edit).click();
    }


}