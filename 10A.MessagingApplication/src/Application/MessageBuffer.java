package Application;

import java.util.LinkedList;
import java.util.Queue;

// Shared buffer class
class MessageBuffer {
    private Queue<String> buffer = new LinkedList<>();
    private int capacity;

    public MessageBuffer(int capacity) {
        this.capacity = capacity;
    }

    // Synchronized method to add messages to the buffer
    public synchronized void produce(String message) throws InterruptedException {
        // Wait if the buffer is full
        while (buffer.size() == capacity) {
            wait();
        }
        // Add the message to the buffer
        buffer.add(message);
        System.out.println("Produced: " + message);
        // Notify the consumer that there's a new message
        notifyAll();
    }

    // Synchronized method to consume messages from the buffer
    public synchronized String consume() throws InterruptedException {
        // Wait if the buffer is empty
        while (buffer.isEmpty()) {
            wait();
        }
        // Consume the message from the buffer
        String message = buffer.poll();
        System.out.println("Consumed: " + message);
        // Notify the producer that space is available
        notifyAll();
        return message;
    }
}



