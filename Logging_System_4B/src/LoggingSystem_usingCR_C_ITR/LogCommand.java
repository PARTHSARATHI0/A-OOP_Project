package LoggingSystem_usingCR_C_ITR;

//LogCommand.java
public class LogCommand implements Command {
 private LogHandler handler;
 private LogLevel level;

 public LogCommand(LogHandler handler, LogLevel level) {
     this.handler = handler;
     this.level = level;
 }

 @Override
 public void execute(String message) {
     handler.handleRequest(level, message);
 }
}
