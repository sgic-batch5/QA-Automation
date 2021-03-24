package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class DashboardPage extends PageBase {
    public SoftAssert softAssert;

    private static By Dashboard = By.id("menu_dashboard_index");
    private static By DashboardAssignleave = By.className("quickLinkText");

    public static void clickDashboard() {
        getDriver().findElement(Dashboard).click();
    }
    public static void clickDashboardAssignleave() {
        getDriver().findElement(DashboardAssignleave).click();
    }






}
