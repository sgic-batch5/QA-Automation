package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PerformancePage extends PageBase {

    public static final By MENU__PERFORMANCE = By.xpath("//a[@id='menu__Performance']");
    public static final By MENU_PERFORMANCE_CONFIGURE = By.xpath("//a[@id='menu_performance_Configure']");
    public static final By MENU_PERFORMANCE_SEARCH_KPI = By.xpath("//a[@id='menu_performance_searchKpi']");
    public static final By MENU_PERFORMANCE_ADD_PERFORMANCE_TRACKER = By.xpath("//a[@id='menu_performance_addPerformanceTracker']");
    public static final By TITLE_XPATH = By.xpath("//a[@class='toggle tiptip']");
    public static final By KPI_360_SEARCH_FORM_JOB_TITLE_CODE = By.id("kpi360SearchForm_jobTitleCode");
    public static final By SEARCH_BTN = By.id("searchBtn");

    public static boolean performanceBtnExist(){
        return getDriver().findElement(MENU__PERFORMANCE).isDisplayed();
    }

    public static void performanceBtnClick(){
        getDriver().findElement(MENU__PERFORMANCE).click();

    }
    public static boolean configureBtnExist(){
        return getDriver().findElement(MENU_PERFORMANCE_CONFIGURE).isDisplayed();
    }
    public static void configureBtnClick(){
        getDriver().findElement(MENU_PERFORMANCE_CONFIGURE).click();
    }
    public static boolean kPIsExist(){
        return  getDriver().findElement(MENU_PERFORMANCE_SEARCH_KPI).isDisplayed();
    }
    public static String kPIsClick(){
        getDriver().findElement(MENU_PERFORMANCE_SEARCH_KPI).click();
        return getDriver().getCurrentUrl();
    }

    public static boolean trackersExist(){
        return getDriver().findElement(MENU_PERFORMANCE_ADD_PERFORMANCE_TRACKER).isDisplayed();
    }

    public static boolean titleExist(){
        return getDriver().findElement(TITLE_XPATH).isDisplayed();
    }

    public static int viewOptions() {
        Select dropdown = new Select(getDriver().findElement(KPI_360_SEARCH_FORM_JOB_TITLE_CODE));
        return dropdown.getOptions().size();
    }

    public static boolean searchBtnExist(){
        return getDriver().findElement(SEARCH_BTN).isDisplayed();
    }

    public static void searchBtnClick(){
        getDriver().findElement(SEARCH_BTN).click();
    }

}
