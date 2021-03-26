package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class RequirmentPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(RequirmentPage.class);

    private static By CandtsBtn = By.id("menu_recruitment_viewRecruitmentModule");
    private static By vacancy = By.id("menu_recruitment_viewJobVacancy");

    private static By Admin = By.id("menu_admin_viewAdminModule");
    private static By user = By.id("searchSystemUser_userName");
    private static By username=By.id("searchSystemUser_userName");
    private static By Add=By.id("btnAdd");
    private static By Role=By.id("systemUser_userType");
    private static By Empo=By.id("systemUser_employeeName_empName");
    private static By Name=By.id("systemUser[userName]");
    private static By name=By.id("systemUser_userName");
    private static By staus=By.id("systemUser_status");




    public static boolean isUserNameDisplay() {

        return getDriver().findElement(CandtsBtn).isDisplayed();
    }

    public static void clickReq() {

        getDriver().findElement(CandtsBtn).click();
    }

    public static boolean isCondidate() {
        return getDriver().findElement(vacancy).isDisplayed();
    }

    public static void clickCondate() {
        getDriver().findElement(vacancy).click();
    }

    public static void clickAdmin() {
        getDriver().findElement(Admin).click();
    }

    public static void setUser() {
        getDriver().findElement(user).click();


    }
    public static void setUsername(){

        getDriver().findElement(username).click();
    }
    public static void clickAdd() {

        getDriver().findElement(Add).click();
    }
    public static void setRoleI(){

        getDriver().findElement(Role).click();
    }
    public static void setEmpo(){
        getDriver().findElement(Empo).click();
    }
 public static void setName(){
        getDriver().findElement(name).click();

 }
public  static void setStaus(){
        getDriver().findElement(staus).click();
}


    }






