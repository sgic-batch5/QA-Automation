package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import javax.naming.Name;

public class AdminPage extends PageBase {
    public SoftAssert softAssert;


    private static By btnrecru = By.id("menu_recruitment_viewRecruitmentModule");
    private static By btncandidate = By.id("menu_recruitment_viewCandidates");
    private static By btnadd = By.name("btnAdd");
    private static By Firstname = By.id("addCandidate_firstName");
    private static By Middlename = By.id("addCandidate_middleName");
    private static By LastName = By.id("addCandidate_lastName");
    private static By Email = By.id("addCandidate_email");
    private static By ContactNo = By.id("addCandidate_contactNo");
    private static By JobVacancy = By.id("addCandidate_vacancy");
    private static By Resume = By.className("addCandidate[resume]");
    private static By Keywords = By.className("addCandidate[keyWords]");
    private static By comment = By.className("addCandidate[comment]");
    private static By DateofApplication = By.id("addCandidate_appliedDate");
    private static By Keepdata = By.id("addCandidate_consentToKeepData");
    private static By btnSave = By.name("btnSave");




    public static boolean isadduserPageDisplay() {

        return getDriver().findElement(btnrecru).isDisplayed();
    }

    public static boolean isaddbuttonDisplay() {

        return getDriver().findElement(btnrecru).isDisplayed();
    }
    public static boolean isFirstNameDisplay() {

        return getDriver().findElement(Firstname).isDisplayed();
    }
    public static boolean isMiddleNameDisplay() {

        return getDriver().findElement(Middlename).isDisplayed();
    }
    public static boolean isLastNameDisplay() {

        return getDriver().findElement(LastName).isDisplayed();
    }
    public static boolean isEmailDisplay() {

        return getDriver().findElement(Email).isDisplayed();
    }
    public static boolean isContactNoDisplay() {

        return getDriver().findElement(ContactNo).isDisplayed();
    }
    public static boolean isJobVacancyDisplay() {

        return getDriver().findElement(JobVacancy).isDisplayed();
    }




        public static void clickadd () {
            getDriver().findElement(btnrecru).click();
        }
        public static void clickadd1 () {
            getDriver().findElement(btncandidate).click();
        }
        public static void clickadd3 () {
            getDriver().findElement(btnadd).click();
        }


    public static void clickadd4() {
        getDriver().findElement(Firstname).sendKeys("Anusha");
    }
    public static void clickadd5() {
        getDriver().findElement(Middlename).sendKeys( "Anu");
        }
    public static void clickadd6() {
        getDriver().findElement(LastName).sendKeys("Tharshan");
    }
    public static void clickadd7() {
        getDriver().findElement(Email).sendKeys("anusha123@gmail.com");
    }
    public static void clickadd8() {
        getDriver().findElement(ContactNo).sendKeys("0212224863");
    }
    public static void clickadd9() {
        getDriver().findElement(JobVacancy).sendKeys("Associate IT Manager");
    }
    public static void clickadd10() {
        getDriver().findElement(Resume).click();
    }
    public static void clickadd11() {
        getDriver().findElement(Keywords).sendKeys("just");
    }
    public static void clickadd12() {
        getDriver().findElement(comment).sendKeys("Key is accepted");
    }
    public static void clickadd13() {
        getDriver().findElement(DateofApplication).click();
    }
    public static void clickadd14() {
        getDriver().findElement(Keywords).click();
    }
    public static void clickadd15() {
        getDriver().findElement(btnSave).click();
    }


}






