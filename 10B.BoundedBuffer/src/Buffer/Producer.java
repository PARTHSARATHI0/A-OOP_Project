package Buffer;

//Producer class
class Producer implements Runnable {
 private BoundedBuffer buffer;

 public Producer(BoundedBuffer buffer) {
     this.buffer = buffer;
 }

 @Override
 public void run() {
     int item = 0;
     try {
         while (true) {
             buffer.produce(item++);
             Thread.sleep(500);  // Simulate time taken to produce
         }
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}