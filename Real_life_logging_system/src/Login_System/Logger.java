package Login_System;

public class Logger {

    // Step 1: Create a private static instance of the class (lazy initialization)
    private static Logger instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Logger() {
        // private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Step 4: Implement the log method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
