package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Add extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By drecuritment = By.id("menu_recruitment_viewRecruitmentModule");
    private static By recuritmentadd = By.id("btnAdd");
    private static By rfullname = By.id("addCandidate_firstName");
    private static By rmiddilename = By.id("addCandidate_middleName");
    private static By rlastname = By.id("addCandidate_lastName");
    private static By remail = By.id("addCandidate_email");
    private static By rcontaact = By.id("addCandidate_contactNo");
    private static By rkeywords = By.id("addCandidate_keyWords");
    private static By rcomments = By.id("addCandidate_comment");
    private static By rconstent = By.id("addCandidate_consentToKeepData");
    private static By rsave = By.id("btnSave");

    private static By Admin = By.id("menu_admin_viewAdminModule");

    //private static By pimemployeelist = By.id("menu_pim_viewEmployeeList");



    public static void clickdrecuritment() {

        getDriver().findElement(drecuritment).click();
    }
    public static void clickdrecuritmentadd() {

        getDriver().findElement(recuritmentadd).click();
    }
    public static void setfirstname(String firstName) {

        getDriver().findElement(rfullname).sendKeys(firstName);
    }
    public static void setmiddilename(String middleName) {

        getDriver().findElement(rmiddilename).sendKeys(middleName);
    }
    public static void setlastname(String lastName) {

        getDriver().findElement(rlastname).sendKeys(lastName);
    }

    public static void setemail(String email) {

        getDriver().findElement(remail).sendKeys(email);
    }

    public static void setcontactno(String contactno) {

        getDriver().findElement(rcontaact).sendKeys(contactno);
    }

    public static void setRkeywords(String keyWords) {

        getDriver().findElement(rkeywords).sendKeys(keyWords);
    }

    public static void setRcomments(String comments) {

        getDriver().findElement(rcomments).sendKeys(comments);
    }

    public static void clickrsave() {

        getDriver().findElement(rsave).click();
    }
    public static void clickrconsent() {

        getDriver().findElement(rconstent).click();
    }

    public static void clickadmin() {

        getDriver().findElement(Admin).click();
    }
/*
    public static void clickpimLoginemployee() {
        getDriver().findElement(pimemployeelist).click();
    }
*/
}

