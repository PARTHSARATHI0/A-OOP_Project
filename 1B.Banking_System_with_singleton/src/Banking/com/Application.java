package Banking.com;

public class Application {
    public static void main(String[] args) {
    	
        UserSession userSession = UserSession.getInstance();

        BankingOperations banking = new BankingOperations();
        
        banking.viewBalance();
        banking.deposit(100);
        banking.withdraw(50);

        userSession.login("Parthsarathi");

        banking.viewBalance();
        banking.deposit(200);
        banking.withdraw(150);

        userSession.login("Parth");

        userSession.logout();

        banking.viewBalance();
    }
}
