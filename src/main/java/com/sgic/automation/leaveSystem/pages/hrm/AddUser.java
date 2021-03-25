package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AddUser extends PageBase {
    public SoftAssert softAssert;


    private static By recruitment = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
    private static By recruitmentAdd = By.id("btnAdd");
    private static By AddFirstName = By.id("addCandidate_firstName");
    private static By AddMiddleName = By.id("addCandidate_middleName");
    private static By AddLastName = By.id("addCandidate_lastName");
    //private static By LastName = By.id("addCandidate_email");


    public static void clickrecruitment() {

        getDriver().findElement(recruitment).click();
    }
    public static void clickrecruitmentAdd() {

        getDriver().findElement(recruitmentAdd).click();
    }



    public static boolean isFirstNameDisplay() {

        return getDriver().findElement(AddFirstName).isDisplayed();
    }
    public static void setAddFirstName(String FirstName) {

        getDriver().findElement(AddFirstName).sendKeys(FirstName);
    }


    public static boolean isMiddleNameDisplay() {

        return getDriver().findElement(AddMiddleName).isDisplayed();
    }
    public static void setAddMiddleName(String MiddleName) {

        getDriver().findElement(AddMiddleName).sendKeys(MiddleName);
    }


    public static boolean isLastNameDisplay() {

        return getDriver().findElement(AddLastName).isDisplayed();
    }
    public static void setAddLastName(String LastName) {

        getDriver().findElement(AddLastName).sendKeys(LastName);
    }
}
