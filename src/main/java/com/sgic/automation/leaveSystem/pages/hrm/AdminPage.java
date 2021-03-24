package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AdminPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(AdminPage.class);

    private static By AdminBtn = By.id("menu_admin_viewAdminModule");
//    private static By txtUserName = By.id("txtUsername");
//    private static By txtPassword = By.id("txtPassword");
//    private static By btnLogin = By.id("btnLogin");
//    private static By alert = By.id("spanMessage");
//    private static String commonLinkString = "//a[@href='LINK']";

    public static boolean isAdminPageDisplay()
    {
        return getDriver().findElement(AdminBtn).isDisplayed();
    }
    public static void ClickAdmin()
    {
        getDriver().findElement(AdminBtn).click();
    }
}
