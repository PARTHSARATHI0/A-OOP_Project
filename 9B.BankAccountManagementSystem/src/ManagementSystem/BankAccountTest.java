package ManagementSystem;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); // Initial balance
        
        // Creating multiple threads simulating different users
        Thread user1 = new Thread(() -> {
            account.deposit(500);
            account.withdraw(200);
            System.out.println(Thread.currentThread().getName() + " final balance: " + account.getBalance());
        }, "User1");

        Thread user2 = new Thread(() -> {
            account.withdraw(700);
            account.deposit(300);
            System.out.println(Thread.currentThread().getName() + " final balance: " + account.getBalance());
        }, "User2");

        Thread user3 = new Thread(() -> {
            account.deposit(100);
            account.withdraw(50);
            System.out.println(Thread.currentThread().getName() + " final balance: " + account.getBalance());
        }, "User3");

        // Start threads
        user1.start();
        user2.start();
        user3.start();

        try {
            // Wait for all threads to finish
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final account balance after all transactions
        System.out.println("Final account balance: " + account.getBalance());
    }
}
