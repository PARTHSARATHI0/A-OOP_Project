package Banking.com;

public class BankingOperations {

    // Simulated balance for demonstration purposes
    private double balance = 1000.00;

    // View balance method
    public void viewBalance() {
        if (UserSession.getInstance().isLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (UserSession.getInstance().isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (UserSession.getInstance().isLoggedIn()) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
