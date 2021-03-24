package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AddUser extends PageBase {
    public SoftAssert softAssert;


    private static By recruitment = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
    private static By recruitmentAdd = By.id("btnAdd");
    private static By recruitmentAddFirstName = By.name("addCandidate[firstName]");
    private static By recruitmentAddMiddleName = By.name("addCandidate[middleName]");
    private static By recruitmentAddLastName = By.name("addCandidate[lastName]");
    private static By recruitmentAddEmail = By.name("addCandidate[email]");
    private static By recruitmentAddContactNo = By.name("addCandidate[contactNo]");
    private static By recruitmentAddJobvacancy = By.name("addCandidate[vacancy]");


    public static void clickrecruitment() {
        getDriver().findElement(recruitment).click();
    }

    public static void clickrecruitmentAdd() { getDriver().findElement(recruitmentAdd).click(); }

    public static boolean isFirstNameDisplay() {

        return getDriver().findElement(recruitmentAddFirstName).isDisplayed();
    }

    public static void setRecruitmentAddFirstName(String FirstName) {

        getDriver().findElement(recruitmentAddFirstName).sendKeys(FirstName);
    }
    public static boolean isMiddleNameDisplay() {

        return getDriver().findElement(recruitmentAddMiddleName).isDisplayed();
    }

    public static void setRecruitmentAddMiddleName(String MiddleName) {

        getDriver().findElement(recruitmentAddMiddleName).sendKeys(MiddleName);
    }

    public static boolean isLastNameDisplay() {

        return getDriver().findElement(recruitmentAddLastName).isDisplayed();
    }
    public static void setRecruitmentAddLastName(String LastName) {

        getDriver().findElement(recruitmentAddLastName).sendKeys(LastName);
    }

    public static boolean isEmailDisplay() {

        return getDriver().findElement(recruitmentAddEmail).isDisplayed();
    }
    public static void setRecruitmentAddEmail(String Email) {

        getDriver().findElement(recruitmentAddEmail).sendKeys(Email);
    }

    public static boolean isContactNoDisplay() {

        return getDriver().findElement(recruitmentAddContactNo).isDisplayed();
    }
    public static void setRecruitmentAddContactNo(String ContactNo) {

        getDriver().findElement(recruitmentAddContactNo).sendKeys(ContactNo);
    }




}
