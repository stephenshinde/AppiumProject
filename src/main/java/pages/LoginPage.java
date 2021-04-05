package pages;

import base.BasePage;
import utility.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage {


        public LoginPage(AppiumDriver<MobileElement> driver) {
                PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }


        @AndroidFindBy(id = "nextButton")
        public MobileElement getStarted_button;

        @AndroidFindBy(id = "button1")
        public MobileElement continue_button;

        @AndroidFindBy(id = "countrySpinner")
        public MobileElement countryCode_Field;

        @AndroidFindBy(id = "numberField")
        public MobileElement phoneNumber_Field;

        @AndroidFindBy(id = "nextButton")
        public MobileElement continueLogin_button;

        @AndroidFindBy(id = "searchEditText")
        public MobileElement searchCountry_Field;

        @AndroidFindBy(id = "title")
        public List<MobileElement> country_List;

        @AndroidFindBy(id = "nextButton")
        public MobileElement privacyAgreeContinue_button;

        @AndroidFindBy(id = "manualInputButton")
        public MobileElement createProfile_button;

        @AndroidFindBy(id = "firstName")
        public MobileElement firstNameText;

        @AndroidFindBy(id = "lastName")
        public MobileElement lastNameText;

        @AndroidFindBy(id = "button_skip")
        public MobileElement laterButton;

        @AndroidFindBy(id = "button_backup")
        public MobileElement backupButton;


        public void clickGetStartedBtn() {
                clickButton(getStarted_button);
        }

        public void clickCountryCodeField() {
                clickButton(countryCode_Field);
        }

        public void enterCountryName(String value) {
                enterText(searchCountry_Field, value);
        }

        public void clickCountryFromList() {
                country_List.get(0).click();
        }

        public void enterPhoneNumber(String phoneNumber) {
                enterText(phoneNumber_Field, phoneNumber);
        }

        public void clickContinueLogin() {
                clickButton(continueLogin_button);
        }

        public void acceptConfirmAlert() {
                getDriver().switchTo().alert().accept();
        }

        public String getConfirmAlertHeaderText() {
                Helper.waitForAlert(getDriver() ,60);
                return getDriver().switchTo().alert().getText();
        }

        public void acceptPrivacyAgreement() {
                clickButton(privacyAgreeContinue_button);
        }

        public void clickTypeNameManualButton() {
                Helper.waitTillElementsGetVisible(getDriver(), createProfile_button, 180);
                clickButton(createProfile_button);
        }

        public void enterFirstName(String firstNameValue) {
                clearText(firstNameText);
                enterText(firstNameText, firstNameValue);
        }

        public void enterLastName(String lastNameValue) {
                clearText(lastNameText);
                enterText(lastNameText, lastNameValue);
        }

        public void clickLaterBtn() {

                clickButton(laterButton);
        }


        private void waitToLoadBackupBtn(){
                Helper.waitTillElementsGetVisible(getDriver(), backupButton, 60);
        }

        public boolean isBackupPresent(){
                waitToLoadBackupBtn();
                return backupButton.isDisplayed();
        }


}
