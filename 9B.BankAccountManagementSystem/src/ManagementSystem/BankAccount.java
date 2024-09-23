package ManagementSystem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method to ensure thread safety
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        }
    }

    // Synchronized withdraw method to ensure thread safety
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance for withdrawal");
        }
    }

    // Synchronized getBalance method to ensure thread safety
    public synchronized double getBalance() {
        return balance;
    }
}
