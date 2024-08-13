package Banking.com;

public class Application {
    public static void main(String[] args) {
        UserSession userSession = UserSession.getInstance();

        // Attempt to perform banking operations without logging in
        BankingOperations banking = new BankingOperations();
        banking.viewBalance();
        banking.deposit(100);
        banking.withdraw(50);

        // Log in as a user
        userSession.login("JohnDoe");

        // Perform banking operations after logging in
        banking.viewBalance();
        banking.deposit(200);
        banking.withdraw(150);

        // Attempt to log in again with the same or different user
        userSession.login("JaneDoe");

        // Log out
        userSession.logout();

        // Try performing operations after logging out
        banking.viewBalance();
    }
}
