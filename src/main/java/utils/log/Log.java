package utils.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;


public class Log {

    private static final Logger logger = LogManager.getLogger(Thread.currentThread().getName());

    public static void info(String message){
        logger.info(message);
    }

    public static void debug(String message){
        logger.debug(message);
    }

    public static void warn(String message){
        logger.warn(message);
    }

    public static void pass(String message){
        logger.warn(message);
    }

    public static void fail(String message){
        logger.error(message);
    }

    public static void exception(String message){
        logger.fatal(message);
    }

    public static void logAssertTrue(Boolean condition,String passMessage, String failMessage){
        if(condition){
            Assert.assertTrue(true,passMessage);
            pass(passMessage);
        }
        else{
            fail(failMessage);
            Assert.fail(failMessage);
        }

    }

    public static void logAssertFalse(Boolean condition,String passMessage, String failMessage){
        if(!condition){
            Assert.assertTrue(true,passMessage);
            pass(passMessage);
        }
        else{
            fail(failMessage);
            Assert.fail(failMessage);
        }

    }
}
