package Buffer;

//Main class to run the Producer-Consumer simulation
public class BoundedBufferTest {
 public static void main(String[] args) {
     BoundedBuffer buffer = new BoundedBuffer();
     
     // Creating producer and consumer threads
     Thread producerThread = new Thread(new Producer(buffer));
     Thread consumerThread = new Thread(new Consumer(buffer));
     
     // Start the threads
     producerThread.start();
     consumerThread.start();
 }
}
