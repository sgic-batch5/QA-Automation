package com.sgic.automation.leaveSystem.pages.hrm;


import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import javax.lang.model.element.Name;

public class Directorypage extends PageBase {
    public SoftAssert softAssert;


    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By btnLogin = By.id("btnLogin");
    private static By directory= By.id("menu_directory_viewDirectory");
    public static boolean isLoginbuttonDisplay() {

        return getDriver().findElement(btnLogin).isDisplayed();


    }
    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static boolean isDirectoryPageDisplay() {
        return getDriver().findElement(directory).isDisplayed();
    }

        public static void ClickDirectory() {

            getDriver().findElement(directory).click();
        }

    }


