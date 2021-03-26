package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class RecruitmentPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(RecruitmentPage.class);

    private static By hdrRecruitment = By.id("menu_recruitment_viewRecruitmentModule");
    private static By btnCandidates = By.id("menu_recruitment_viewCandidates");
    private static By Candidates = By.id("srchCandidates");
    private static By CandidateName = By.id("candidateSearch_candidateName");
    private static By txtkeyword = By.id("candidateSearch_keywords");


    public static void clickRecruitment() {
        getDriver().findElement(hdrRecruitment).click();
    }
    public static boolean isRecruitmentPageDisplay(){

      return getDriver().findElement(hdrRecruitment).isDisplayed();
    }

    public static boolean isCandidateNameDisplay(){
        return getDriver().findElement(CandidateName).isDisplayed();
    }

    public static void clickCandidates(){
        getDriver().findElement(btnCandidates).click();

    }
    public static boolean isCandidateKeyDisplay(){
        return getDriver().findElement(txtkeyword).isDisplayed();
    }




//    public static boolean isLoginPageDisplay() {
//
//        return getDriver().findElement(hdrRecruitment).isDisplayed();
//
//    }
}



