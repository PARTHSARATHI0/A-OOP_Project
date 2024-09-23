package Application;

public class MessagingApp {
    public static void main(String[] args) {
        // Define a buffer with a capacity of 5 messages
        MessageBuffer buffer = new MessageBuffer(5);

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        // Start both threads
        producerThread.start();
        consumerThread.start();
    }
}