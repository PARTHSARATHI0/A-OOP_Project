package Application;

//Producer class
class Producer implements Runnable {
 private MessageBuffer buffer;

 public Producer(MessageBuffer buffer) {
     this.buffer = buffer;
 }

 @Override
 public void run() {
     int messageCount = 1;
     while (true) {
         String message = "Message " + messageCount;
         try {
             buffer.produce(message);
             messageCount++;
             Thread.sleep(1000); // Simulating time taken to produce a message
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}
