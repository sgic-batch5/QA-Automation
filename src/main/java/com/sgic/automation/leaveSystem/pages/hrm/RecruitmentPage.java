package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class RecruitmentPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(RecruitmentPage.class);

    private static By hdrRecruitment = By.id("menu_recruitment_viewRecruitmentModule");
    private static By btnCandidates = By.id("menu_recruitment_viewCandidates");
    private static By CandidateName = By.id("candidateSearch_candidateName");
    private static By Keywords = By.id("candidateSearch_keywords");
    private static By btnAdd = By.id("btnAdd");
    private static By FirstName = By.id("addCandidate_firstName");
    private static By MiddleName = By.id("addCandidate_middleName");

    public static void clickRecruitment() {
        getDriver().findElement(hdrRecruitment).click();
    }

    public static void clickbtnCandidates() {
        getDriver().findElement(btnCandidates).click();
    }


    public static void setCandidatesName(String candidateName) {

        getDriver().findElement(CandidateName).sendKeys(candidateName);
    }

    public static void setKeywords(String Keyword) {

        getDriver().findElement(Keywords).sendKeys(Keyword);


    }

    public static void clickbtnAdd() {
        getDriver().findElement(btnAdd).click();

    }

    public static void setFirstName(String FName) {
        getDriver().findElement(FirstName).click();


    }

    public static void setMiddleName(String MName) {
        getDriver().findElement(MiddleName).click();

    }
}











