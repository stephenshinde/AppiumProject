    package Tests;

    import base.DriverFactory;
    import org.testng.annotations.Parameters;
    import utility.ConfigFileReader;
    import utility.ReportHelper;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.BeforeMethod;

    import java.net.MalformedURLException;

    public class TestBase extends DriverFactory {

        ConfigFileReader reader = new ConfigFileReader();

        @BeforeClass
        public void initializeSetting() {
            // start extent report methood

            ReportHelper.startExtentReport(System.getProperty("user.dir") + reader.getExtentReportPath());

        }

        @Parameters({"platformVersion","deviceName"})
        @BeforeMethod
        public void launchApp(String version, String deviceName) throws MalformedURLException {
            setUp(version , deviceName);
        }

        public void closeApp() {
            destroyApp();
        }

        @AfterClass
        public void endSetting() {
            ReportHelper.closeExtentReport();
        }
    }
