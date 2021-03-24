package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AdminPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(AdminPage.class);

    public static By AdminBtn = By.id("menu_admin_viewAdminModule");
    public static By JobBtn = By.id("menu_admin_Job");
    public static By viewJobTitleList = By.id("menu_admin_viewJobTitleList");
    public static By viewPayGrades = By.id("menu_admin_viewPayGrades");
    public static By jobCategory = By.id("menu_admin_jobCategory");
    public static By workShift = By.id("menu_admin_workShift");
    public static By employmentStatus = By.id("menu_admin_employmentStatus");


    private static By addName = By.id("payGrade_name");
    private static By addEmpSta = By.id("empStatus_name");
    private static By addJobCate = By.id("jobCategory_name");
    private static By addWorkShift = By.id("workShift_name");


    public static boolean isAdminPageDisplay()
    {
        return getDriver().findElement(AdminBtn).isDisplayed();
    }
    public static boolean isJobPageDisplay()
    {
        return getDriver().findElement(JobBtn).isDisplayed();
    }
    public static boolean isJobTitles()
    {
        return getDriver().findElement(viewJobTitleList).isDisplayed();
    }
    public static boolean isViewPayGrades()
    {
        return getDriver().findElement(viewPayGrades).isDisplayed();
    }
    public static boolean isJobCategory()
    {
        return getDriver().findElement(jobCategory).isDisplayed();
    }
    public static boolean isWorkShift(){ return getDriver().findElement(workShift).isDisplayed();}
    public static boolean isempstat(){ return getDriver().findElement(employmentStatus).isDisplayed();}


    public static void ClickAdmin()
    {
        getDriver().findElement(AdminBtn).click();
    }
    public static void ClickJob()
    {
        getDriver().findElement(JobBtn).click();
    }
    public static void ClickJobTitle()
    {
        getDriver().findElement(viewJobTitleList).click();
    }
    public static void ClickPayGrades()
    {
        getDriver().findElement(viewPayGrades).click();
    }
    public static void ClickJobCategory()
    {
        getDriver().findElement(jobCategory).click();
    }
    public static void ClickWorkShift()
    {
        getDriver().findElement(workShift).click();
    }
    public static void ClickEmpSta()
    {
        getDriver().findElement(employmentStatus).click();
    }


    public static boolean isNameDisplay() {
        return getDriver().findElement(addName).isDisplayed();
    }
    public static void setName(String Names)
    {
        getDriver().findElement(addName).sendKeys("PRGS");
    }

    public static boolean isEmpStaDisplay()
    {
        return getDriver().findElement(addEmpSta).isDisplayed();
    }
    public static void setEmpSta(String EmpSta)
    {
        getDriver().findElement(addEmpSta).sendKeys("PRGS");
    }

    public static boolean isJobCat()
    {
        return getDriver().findElement(addJobCate).isDisplayed();
    }
    public static void setJobCate(String JobCate)
    {
        getDriver().findElement(addJobCate).sendKeys("PRGS");
    }


    public static boolean isWorkShiftDis()
    {
        return getDriver().findElement(addWorkShift).isDisplayed();
    }
    public static void setWorkShift(String Shift)
    {
        getDriver().findElement(addWorkShift).sendKeys("PRGS");
    }

}
