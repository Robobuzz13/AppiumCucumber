package utils.driverManager;

public enum DriverFactory {

    public abstract  AppiumDriver getDriver(String deviceName, String deviceVersion, String appName);

    @Override
    public AppiumDriver getDriver(String deviceName, String deviceVersion, String appName){

    }
}
