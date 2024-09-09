package Loginsystem;

public abstract class LogHandler {
    protected LogHandler next;

    public void setNext(LogHandler nextHandler) {
        this.next = nextHandler;
    }

    public void handleRequest(LogLevel level, String message) {
        if (canHandle(level)) {
            writeMessage(message);
        } else if (next != null) {
            next.handleRequest(level, message);
        }
    }

    protected abstract boolean canHandle(LogLevel level);

    protected abstract void writeMessage(String message);
}
