package basicAppium;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    AppiumDriver phone;

    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities =  new DesiredCapabilities();
        capabilities.setCapability("deviceName", "QAPRueba1");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.google.android.deskclock");
        capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");



        phone = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterEach
    public void closeApp(){
        phone.quit();
    }

    @Test
    public void verifyCalc() throws InterruptedException {

            Thread.sleep(5000);
    }
}
