package LoggingSystem_usingCR_C_ITR;

//Client.java
public class Client {
 public static void main(String[] args) {
     // Create handlers
     LogHandler infoHandler = new InfoHandler();
     LogHandler debugHandler = new DebugHandler();
     LogHandler errorHandler = new ErrorHandler();

     // Setup chain of responsibility
     infoHandler.setNext(debugHandler);
     debugHandler.setNext(errorHandler);

     // Create commands
     Command infoCommand = new LogCommand(infoHandler, LogLevel.INFO);
     Command debugCommand = new LogCommand(infoHandler, LogLevel.DEBUG);
     Command errorCommand = new LogCommand(infoHandler, LogLevel.ERROR);

     // Logger setup
     Logger logger = new Logger();
     logger.addCommand(infoCommand);
     logger.addCommand(debugCommand);
     logger.addCommand(errorCommand);

     // Process commands
     logger.processCommands();
 }
}
