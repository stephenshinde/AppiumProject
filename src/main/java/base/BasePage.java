package base;

import io.appium.java_client.MobileElement;

public class BasePage extends DriverFactory {

    public void clickButton(MobileElement element) {
        element.click();
    }

    public void enterText(MobileElement element, String value) {
        element.sendKeys(value);
    }

    public void clearText(MobileElement element) {
        element.clear();
    }


}
