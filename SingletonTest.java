import java.util.*;
import java.lang.*;

public class SingletonTest { // creating a singleton first class
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance(); // creating singleton class uding getinstance method
        logger1.log("First log message");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");
        System.out.println("Are both instances the same? " + (logger1 == logger2));

        try { // writing test case check if its working
            Logger logger3 = Logger.class.getDeclaredConstructor().newInstance();
            logger3.log("This should not work");
        } catch (Exception e) {
            System.out.println("Cannot create instance via reflection: " + e.getMessage());
        }
    }
}
class Logger {  // creating logger class
    
    private static Logger instance;
    
    private Logger() {  // private constructor of logger 
        System.out.println("Logger instance initialized");
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
