package Tests;

import pages.LoginPage;
import utility.ReportHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void LoginApplication() {
        ReportHelper.extenttest = ReportHelper.addTestCasename("LoginApplication", "Login in truecaller application");
        LoginPage loginpage = new LoginPage(getDriver());
        ReportHelper.extenttest.info("I click on get started button");
        loginpage.clickGetStartedBtn();
        ReportHelper.extenttest.info("I click on country code spinner");
        loginpage.clickCountryCodeField();
        ReportHelper.extenttest.info("I enter my country name");
        loginpage.enterCountryName("India");
        ReportHelper.extenttest.info("I click on country name");
        loginpage.clickCountryFromList();
        ReportHelper.extenttest.info("I enter phone number");
        loginpage.enterPhoneNumber("9987028455");
        ReportHelper.extenttest.info("I click on continue button for login");
        loginpage.clickContinueLogin();
        Assert.assertEquals(loginpage.getConfirmAlertHeaderText(), "Confirm Your Number\n" +
                "Is this your correct phone number? +91 9987028455");
        loginpage.acceptConfirmAlert();
        ReportHelper.extenttest.info("I click on privacy agreement button for proceed");
        loginpage.acceptPrivacyAgreement();
        ReportHelper.extenttest.info("I click on type name manual button");
        loginpage.clickTypeNameManualButton();
        ReportHelper.extenttest.info("I enter my first name");
        loginpage.enterFirstName("Stephen");
        ReportHelper.extenttest.info("I enter my last name");
        loginpage.enterLastName("Shinde");
        ReportHelper.extenttest.info("I click on continue button to proceed");
        loginpage.clickContinueLogin();
        ReportHelper.extenttest.info("I wait to see backup button");
        Assert.assertTrue(loginpage.isBackupPresent());
        ReportHelper.extenttest.info("I click on later button");
        loginpage.clickLaterBtn();



    }
}
