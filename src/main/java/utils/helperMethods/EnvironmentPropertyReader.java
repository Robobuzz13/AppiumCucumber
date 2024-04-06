package utils.helperMethods;

import utils.log.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvironmentPropertyReader {
   private static EnvironmentPropertyReader envProperties;
    private Properties properties;

    /**
     * Constructor to call load properties method
     */
    private EnvironmentPropertyReader() {
        properties = loadProperties();
    }

    /**
     * Load property from config properties
     *
     * @return property
     */
    private Properties loadProperties() {

        Properties props = new Properties();
        try {
            InputStream cpr = EnvironmentPropertyReader.class.getResourceAsStream("src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"config.properties");
            props.load(cpr);
            cpr.close();
        } catch (FileNotFoundException e) {
            Log.exception("config.properties is missing or corrupt : " + e.getMessage());
        } catch (IOException e) {
            Log.exception("read failed due to: " + e.getMessage());
        }
        return props;
    }

    public static EnvironmentPropertyReader getInstance() {
        if (envProperties == null) {
            envProperties = new EnvironmentPropertyReader();
        }
        return envProperties;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
