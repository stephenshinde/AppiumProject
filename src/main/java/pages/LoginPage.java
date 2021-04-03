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
        public MobileElement GetStarted_button;

        @AndroidFindBy(id = "button1")
        public MobileElement Continue_button;

        @AndroidFindBy(id = "countrySpinner")
        public MobileElement CountryCode_Field;

        @AndroidFindBy(id = "numberField")
        public MobileElement PhoneNumber_Field;

        @AndroidFindBy(id = "nextButton")
        public MobileElement ContinueLogin_button;

        @AndroidFindBy(id = "searchEditText")
        public MobileElement SearchCountry_Field;

        @AndroidFindBy(id = "title")
        public List<MobileElement> Country_List;

        @AndroidFindBy(id = "nextButton")
        public MobileElement PrivacyAgreeContinue_button;

        @AndroidFindBy(id = "manualInputButton")
        public MobileElement CreateProfile_button;

        @AndroidFindBy(id = "firstName")
        public MobileElement FirstName;

        @AndroidFindBy(id = "firstName")
        public MobileElement LastName;


        public void clickGetStartedBtn() {
                clickButton(GetStarted_button);
        }

        public void clickCountryCodeField() {
                clickButton(CountryCode_Field);
        }

        public void enterCountryName(String value) {
                enterText(SearchCountry_Field, value);
        }

        public void clickCountryFromList() {
                Country_List.get(0).click();
        }

        public void enterPhoneNumber(String phoneNumber) {
                enterText(PhoneNumber_Field, phoneNumber);
        }

        public void clickContinueLogin() {
                clickButton(ContinueLogin_button);
        }

        public void acceptConfirmAlert() {
                getDriver().switchTo().alert().accept();
        }

        public String getConfirmAlertHeaderText() {
                return getDriver().switchTo().alert().getText();
        }

        public void acceptPrivacyAgreement() {
                clickButton(PrivacyAgreeContinue_button);
        }

        public void clickTypeNameManualButton() {
                Helper.waitTillElementsGetVisible(getDriver(), CreateProfile_button, 120);
                clickButton(CreateProfile_button);
        }

        public void enterFirstName(String firstName) {
                clearText(FirstName);
                enterText(FirstName, firstName);
        }

        public void enterLastName(String lastName) {
                clearText(LastName);
                enterText(LastName, lastName);
        }


}
