package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class recruitment extends PageBase {
    public SoftAssert softAssert;


    private static By btnrecruitment = By.id("menu_recruitment_viewRecruitmentModule");
    private static By btncandidates = By.id("menu_recruitment_viewCandidates");
    private static By btnaddrecr = By.id("btnAdd");
    private static By txtfirstname = By.id("addCandidate_firstName");
    private static By txtmiddlename = By.id("addCandidate_middleName");
    private static By txtlastname = By.id("addCandidate_lastName");
    private static By txtemail = By.id("addCandidate_email");
    private static By txtcontactno = By.id("addCandidate_contactNo");
    private static By listvacancy = By.id("addCandidate_vacancy");
    private static By chooseresume = By.className("fieldHelpBottom");
    private static By txtkeyword = By.id("addCandidate_keyWords");
    private static By txacomment = By.id("addCandidate_comment");
    private static By dateofapplication = By.id("addCandidate_appliedDate");
    private static By keepdata = By.className("checkbox");
    private static By btnSave = By.id("btnSave");




    public static boolean isadduserPageDisplay() {

        return getDriver().findElement(btnrecruitment).isDisplayed();


    }

    public static boolean isaddbuttonDisplay() {

        return getDriver().findElement(btnrecruitment).isDisplayed();
    }

    public static boolean isaTxtFirNamePageDisplay() {

        return getDriver().findElement(txtfirstname).isDisplayed();


    }

    public static void clickadd3() {
        getDriver().findElement(btnrecruitment).click();
    }

    public static void clickadd4() {
        getDriver().findElement(btncandidates).click();
    }

    public static void clickadd5() {
        getDriver().findElement(btnaddrecr).click();
    }

    public static void clickadd6() {
        getDriver().findElement(txtfirstname).sendKeys("saru");
    }

    public static void clickadd7() {
        getDriver().findElement(txtmiddlename).sendKeys("maya");
    }

    public static void clickadd8() {
        getDriver().findElement(txtlastname).sendKeys("suji");

    }

    public static void clickadd9() {
        getDriver().findElement(txtemail).sendKeys("suji@gmail.com");

    }

    public static void clickadd10() {
        getDriver().findElement(txtcontactno).sendKeys("077123456");
    }
    public static void clickadd11() {
        getDriver().findElement(listvacancy).sendKeys("Junior Account Assistant");
    }
    public static void clickadd12() {
        getDriver().findElement(chooseresume).click();
    }
    public static void clickadd13() {

        getDriver().findElement(txtkeyword).sendKeys("just");
    }
    public static void clickadd14() {

        getDriver().findElement(txacomment).sendKeys("just checking");
    }
    public static void clickadd15() {
        getDriver().findElement(dateofapplication).click();
       // getDriver().findElement(dateofapplication).sendKeys("2021-03-24");
    }
    public static void clickadd16() {
        getDriver().findElement(keepdata).click();

    }
    public static void clickadd17() {
        getDriver().findElement(btnSave).click();
    }
}








