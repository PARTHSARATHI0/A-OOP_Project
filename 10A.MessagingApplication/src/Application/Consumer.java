package Application;

class Consumer implements Runnable {
    private MessageBuffer buffer;

    public Consumer(MessageBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(1500); // Simulating time taken to consume a message
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
