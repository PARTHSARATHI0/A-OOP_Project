package Buffer;

//Consumer class
class Consumer implements Runnable {
 private BoundedBuffer buffer;

 public Consumer(BoundedBuffer buffer) {
     this.buffer = buffer;
 }

 @Override
 public void run() {
     try {
         while (true) {
             buffer.consume();
             Thread.sleep(1000);  // Simulate time taken to consume
         }
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}