package LoggingSystem_usingCR_C_ITR;

//LogHandler.java
public abstract class LogHandler {
 protected LogHandler next;

 public void setNext(LogHandler next) {
     this.next = next;
 }

 public void handleRequest(LogLevel level, String message) {
     if (canHandle(level)) {
         logMessage(message);
     } else if (next != null) {
         next.handleRequest(level, message);
     }
 }

 protected abstract boolean canHandle(LogLevel level);
 protected abstract void logMessage(String message);
}
