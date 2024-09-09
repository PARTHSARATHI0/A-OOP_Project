package Login_System;

public class Application {
    public static void main(String[] args) {
        // Step 5: Get the logger instance and log messages
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
        
        // Simulate some operations and log messages
        performOperation("User logged in");
        performOperation("User added a new item to the cart");
        performOperation("User checked out");

        logger.log("Application finished.");
    }

    private static void performOperation(String operation) {
        Logger logger = Logger.getInstance();
        logger.log("Operation: " + operation);
    }
}
