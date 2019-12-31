package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MainTest {

    public AndroidDriver<AndroidElement> ad;
    public MainTest() {
        initializeProperties();
    }


    private void initializeProperties() {

    }

    public void beforeClass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.arqonia.supermemopolaco");
        capabilities.setCapability("appActivity", ".MainActivity");
        capabilities.setCapability("skipDeviceInitialization", true);
        capabilities.setCapability("skipServerInstallation", true);
        capabilities.setCapability("ignoreUnimportantViews", true);

        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    /**
     * This method is called by Cucumber @After annotation in TestSteps class. It simply kills driver
     */
    public void afterClass() {
        ad.close();
        ad.quit();
    }


}
