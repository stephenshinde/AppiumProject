package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utility.ConfigFileReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private AppiumDriver<MobileElement> driver;

    public static ThreadLocal<AppiumDriver> dr = new ThreadLocal<>();

    public AppiumDriver<MobileElement> getDriver() {
        return dr.get();
    }

    public void setDriver(AppiumDriver<MobileElement> driver) {
        dr.set(driver);
    }

    ConfigFileReader reader = new ConfigFileReader();


    public void setUp(String version, String deviceName) throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capability.setCapability("autoGrantPermissions", "true");

        capability.setCapability("appPackage", "com.truecaller");
        capability.setCapability("appActivity", "com.truecaller.ui.TruecallerInit");


        setDriver(new AppiumDriver<MobileElement>(new URL(reader.getDriverUrl()), capability));
        getDriver().manage().timeouts().implicitlyWait(reader.getImplicitlyWait(), TimeUnit.SECONDS);


    }

    /**
     * Dispose driver object
     */
    public void destroyApp() {
        getDriver().quit();
    }

}



