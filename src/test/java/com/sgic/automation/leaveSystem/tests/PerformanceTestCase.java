package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.hrm.LoginPage;
import com.sgic.automation.leaveSystem.pages.hrm.PerformancePage;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PerformanceTestCase extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(PerformanceTestCase.class);

    @Test(testName = "PerformanceKPI_TestCase")
    public void performanceFunctTestCase() {
        softAssert = new SoftAssert();

        softAssert.assertTrue(PerformancePage.performanceBtnExist(), "Performance button is not found");
        PerformancePage.performanceBtnClick();

        softAssert.assertTrue(PerformancePage.configureBtnExist(), "Configure Btn not exist");
        PerformancePage.configureBtnClick();

        softAssert.assertTrue(PerformancePage.kPIsExist(), "KPI Btn not exist");
        String actualKPIsUrl = "https://opensource-demo.orangehrmlive.com/index.php/performance/searchKpi";
        softAssert.assertEquals(PerformancePage.kPIsClick(), actualKPIsUrl);
}

}

