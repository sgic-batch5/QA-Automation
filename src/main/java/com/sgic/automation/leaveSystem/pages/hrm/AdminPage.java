package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AdminPage extends PageBase {
    public SoftAssert softAssert;


    private static By Admin = By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
    private static By txtUserName = By.id("txtUsername");


    public static void clickAdmin() {

        getDriver().findElement(Admin).click();
    }


}
