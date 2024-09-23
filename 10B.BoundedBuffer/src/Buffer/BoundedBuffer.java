package Buffer;

import java.util.LinkedList;

class BoundedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private final int CAPACITY = 10;

    // Produce an item and add to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == CAPACITY) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();  // Wait if buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll();  // Notify the consumer that an item is produced
    }

    // Consume an item from the buffer
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();  // Wait if buffer is empty
        }
        int item = buffer.removeFirst();
        System.out.println("Consumed: " + item);
        notifyAll();  // Notify the producer that an item is consumed
        return item;
    }
}
