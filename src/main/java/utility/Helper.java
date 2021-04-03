package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {


    public static void waitTillElementsGetVisible(AppiumDriver driver, MobileElement locator, int timeout) {

        try {

            WebDriverWait wait = new WebDriverWait(driver, timeout);
            MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(locator));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("element is not getting visible");
        }
    }
}
