package utils.driverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

public class AndroidLocal {

    protected AppiumDriver createDriver(String deviceName, String deviceVersion, String appName){
        try{
            UiAutomator2Options options = new UiAutomator2Options()
                    .setUdid(deviceName)
                    .setPlatformVersion(deviceVersion)
                    .setApp(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"build"+File.separator+appName)
                    .ensureWebviewsHavePages()
                    .chromedriverUseSystemExecutable();
            return(new AndroidDriver(URI.create("https://www.example.com").toURL(),options));

        }catch(MalformedURLException e){
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}
