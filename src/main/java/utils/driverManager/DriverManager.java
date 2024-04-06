package utils.driverManager;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import utils.log.Log;

import java.io.File;

public class DriverManager {

    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<>();
    private static ThreadLocal<String> platformName = new ThreadLocal<>();

    public AppiumDriverLocalService windowsAppiumService() {
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File(platformName.get() + "_"
                        + deviceName.get() + File.separator + "Server.log")));
    }

    public void startServer(){
        Log.info("starting appium server");
        AppiumDriverLocalService server ;
        if()
        = windowsAppiumService();
        server.start();
        if(!server.isRunning()){
            Log.exception("Appium server not started.");
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started.");
        }
        server.clearOutPutStreams();
        DriverManager.server.set(server);
        Log.info("Appium server started");
    }







}
