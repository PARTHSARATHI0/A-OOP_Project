package Loginsystem;

public class Client {
    public static void main(String[] args) {
        // Set up the chain of responsibility
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNext(debugHandler);
        debugHandler.setNext(errorHandler);

        // Create Logger
        Logger logger = new Logger();

        // Create LogCommands for different levels
        Command infoCommand = new LogCommand(infoHandler, LogLevel.INFO);
        Command debugCommand = new LogCommand(debugHandler, LogLevel.DEBUG);
        Command errorCommand = new LogCommand(errorHandler, LogLevel.ERROR);

        // Add commands to the logger
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        // Process logs
        logger.processLogs();
    }
}
