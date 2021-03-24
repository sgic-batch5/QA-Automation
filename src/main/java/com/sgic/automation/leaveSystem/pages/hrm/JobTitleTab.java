package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class JobTitleTab extends AdminPage {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(JobTitleTab.class);

    private static By addingBtn = By.id("btnAdd");
    private static By JobTitle = By.id("jobTitle_jobTitle");
    private static By JobDes = By.id("jobTitle_jobDescription");
    private static By jobChooseFile = By.xpath("//*[@id=\"jobTitle_jobSpec\"]");
    private static By Note = By.id("jobTitle_note");
    private static By Save = By.id("btnSave");


    public static boolean isAddBtnDisplay() {
        return getDriver().findElement(addingBtn).isDisplayed();
    }
    public static boolean isAddJobTitle() {
        return getDriver().findElement(JobTitle).isDisplayed();
    }
    public static boolean isAddJobDes() {
        return getDriver().findElement(JobDes).isDisplayed();
    }
    public static boolean isChooseFileDisplay() {
        return getDriver().findElement(jobChooseFile).isDisplayed();
    }
    public static boolean isAddNote() {
        return getDriver().findElement(Note).isDisplayed();
    }
    public static boolean isSaveDisplay() {
        return getDriver().findElement(Save).isDisplayed();
    }




    public static void ClickAdd() {
        getDriver().findElement(addingBtn).click();
    }

    public static void setJobTitle(String JobTitles) {
        getDriver().findElement(JobTitle).sendKeys("PRGS");
    }

    public static void setJobDes(String JobDescription) {
        getDriver().findElement(JobDes).sendKeys("QualityAssurance");
    }

    public static void ClickChoose() {
        getDriver().findElement(jobChooseFile).click();
    }

    public static void setNote(String Notes) {
        getDriver().findElement(Note).sendKeys("HI,It works Prgs!!");
    }

    public static void ClickSave() {
        getDriver().findElement(Save).click();
    }



}




