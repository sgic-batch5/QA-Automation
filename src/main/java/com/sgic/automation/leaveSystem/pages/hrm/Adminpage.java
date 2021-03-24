package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Adminpage  extends PageBase {
    public SoftAssert softAssert;


    private static By btnadmin = By.id("menu_admin_viewAdminModule");
    private static By btnauserMa = By.id("menu_admin_UserManagement");
    private static By btnuser = By.id("menu_admin_viewSystemUsers");


    public static boolean isadduserPageDisplay() {

        return getDriver().findElement(btnadmin).isDisplayed();


    }

    public static boolean isaddbuttonDisplay() {

        return getDriver().findElement(btnadmin).isDisplayed();
    }



    public static void clickadd() {
        getDriver().findElement(btnadmin).click();
    }
    public static void clickadd1() {
        getDriver().findElement(btnauserMa).click();
    }

}




