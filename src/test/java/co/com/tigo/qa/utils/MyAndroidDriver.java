package co.com.tigo.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static co.com.tigo.qa.utils.API.getAppUrl;

public class MyAndroidDriver {
    private static AppiumDriver<MobileElement> driver;

    public static MyAndroidDriver hisBrowserStackDriver() throws MalformedURLException {

        List<String> lastApps = getAppUrl();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", "metisautomation_AQSV87");
        caps.setCapability("browserstack.key", "UUoDKEhYg3BvwggxztKb");
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("appium.platformName", "Android");
        caps.setCapability("appium.browserName", "Chrome");
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");
//        caps.setCapability("app", lastApps.get(0));
        caps.setCapability("app", "bs://3da9b40b180d7bb58cc21c1786429c87e8e247b8");
        caps.setCapability("browserstack.appium_version", "1.20.2");
//        caps.setCapability("browserstack.geoLocation", "CO");
        caps.setCapability("locale", "CO");
        caps.setCapability("language", "ES");
        caps.setCapability("browserstack.local", "true");


        driver = new AppiumDriver<MobileElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
        return new MyAndroidDriver();
    }
    public static MyAndroidDriver hisLocalAndroidDriver () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("deviceName", "64eea528");
        caps.setCapability("appPackage", "com.mobiquityinc.mitigo");
//        caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
        caps.setCapability("noReset", true);
        caps.setCapability("app", "C:\\indra backup\\REPO\\tigo_colombia\\mobile\\oneapp\\src\\test\\resources\\app\\app-debug_UAT_629.apk");
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        return new MyAndroidDriver();
    }

    public RemoteWebDriver enLaApp() {
        return driver;
    }
}
