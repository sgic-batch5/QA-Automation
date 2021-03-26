package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AdminPage extends PageBase {

    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(AdminPage.class);

    private static By btnLogin = By.id("menu_admin_viewAdminModule");


    public static void clickAdmin() {

        getDriver().findElement(By.id("btnLogin")).click();
    }
}
