package com.sgic.automation.leaveSystem.pages.hrm;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MyInfoPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(MyInfoPage.class);

    private static By hdrInfo = By.id("menu_pim_viewMyDetails");
    private static By hdredit = By.id("btnSave");
    private static By hdrfullname = By.id("personal_txtEmpFirstName");
    private static By hdrmiddlename = By.id("personal_txtEmpMiddleName");
    private static By hdrlastname = By.id("personal_txtEmpLastName");
    private static By hdremployeeid = By.id("personal_txtEmployeeId");
    private static By hdrotherid = By.id("personal_txtOtherID");
    private static By hdrlicencenum = By.id("personal_txtLicenNo");
    private static By hdrdate = By.id("personal_txtLicExpDate");
    private static By hdrssnNumber = By.id("personal_txtNICNo");
    private static By hdrsinNumber = By.id("personal_txtSINNo");
    private static By hdrgender = By.id("personal_optGender_1");
    private static By hdradmin = By.id("menu_admin_viewAdminModule");
    private static By hdrusermanagement = By.id("menu_admin_viewAdminModule");


//    WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
//    WebElement radio2 = driver.findElement(By.id("vfb-7-2"));






    private static String commonLinkString = "//a[@href='LINK']";

    public static void clickLink(String link) {
        getDriver().findElement(By.xpath(commonLinkString.replace("LINK", link))).click();
        LOGGER.info("Link " + link + " Clicked");
    }

    public static boolean isHDRDisplay() {

        return getDriver().findElement(hdrInfo).isDisplayed();
    }
    public static boolean iseditDisplay() {

        return getDriver().findElement(hdredit).isDisplayed();
    }

    public static boolean isfullNameDisplay() {

        return getDriver().findElement(hdrfullname).isDisplayed();
    }

    public static boolean isMiddleNameDisplay() {

        return getDriver().findElement(hdrmiddlename).isDisplayed();
    }
    public static boolean isLastNameDisplay() {

        return getDriver().findElement(hdrlastname).isDisplayed();
    }
    public static boolean isemployeeidDisplay(){
        return  getDriver().findElement(hdremployeeid).isDisplayed();
    }
    public static boolean isotheridDisplay(){
        return  getDriver().findElement(hdrotherid).isDisplayed();
    }
    public static boolean islicencenumDisplay(){
        return  getDriver().findElement(hdrlicencenum).isDisplayed();
    }
    public static boolean isdateDisplay(){
        return  getDriver().findElement(hdrdate).isDisplayed();
    }

    public static  boolean isssnNumberDisplay(){
        return getDriver().findElement(hdrssnNumber).isDisplayed();
    }
    public static  boolean issinNumberDisplay(){
        return getDriver().findElement(hdrsinNumber).isDisplayed();
    }

    public static boolean isgenderDisplay(){
        return getDriver().findElement(hdrgender).isDisplayed();
    }
    public static boolean isHDRadminDisplay() {

        return getDriver().findElement(hdradmin).isDisplayed();
    }
    public static boolean isHDRusermanagementDisplay() {

        return getDriver().findElement(hdrusermanagement).isDisplayed();
    }




    public static void clickInfo() {

        getDriver().findElement(hdrInfo).click();
    }
    public static void clickedit() {

        getDriver().findElement(hdredit).click();
    }
   public static void setfullName(String fullName) {

        getDriver().findElement(hdrfullname).sendKeys(fullName);
        }
    public static void setmiddlename(String middlename) {

        getDriver().findElement(hdrmiddlename).sendKeys(middlename);
    }

    public static void setHdrlastname(String lastname){

        getDriver().findElement(hdrlastname).sendKeys(lastname);
    }

    public static void sethdremployeeid(String employeeid){
        getDriver().findElement(hdremployeeid).sendKeys(employeeid);
    }
    public static void setotherid(String otherid){
        getDriver().findElement(hdrotherid).sendKeys(otherid);
    }
    public static void setlicencenum(String licencenum){
        getDriver().findElement(hdrlicencenum).sendKeys(licencenum);
    }
    public static void setdate(String date){
        getDriver().findElement(hdrdate).sendKeys(date);
    }
    public static void setssnNumber(String ssnNumber){
        getDriver().findElement(hdrssnNumber).sendKeys(ssnNumber);
    }
    public static void setsinNumber(String sinNumber){
        getDriver().findElement(hdrsinNumber).sendKeys(sinNumber);
    }

     public static void clickgender() {

        getDriver().findElement(hdrgender).click();
    }
    public static void clickadmin() {

        getDriver().findElement(hdradmin).click();
    }
    public static void clickusermanagement() {

        getDriver().findElement(hdrusermanagement).click();
    }


public static void  clearName(){
    getDriver().findElement(hdrfullname).clear();
}
}