package Banking.com;

public class UserSession {

    // Step 1: Create a private static instance of the class (lazy initialization)
    private static UserSession instance;

    // Step 2: Private variable to maintain the login state
    private boolean isLoggedIn = false;
    private String userName;

    // Step 3: Make the constructor private to prevent instantiation
    private UserSession() {
        // private constructor to prevent instantiation
    }

    // Step 4: Provide a public static method to get the instance
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Step 5: Method to log in the user
    public void login(String userName) {
        if (!isLoggedIn) {
            this.userName = userName;
            isLoggedIn = true;
            System.out.println("User " + userName + " logged in.");
        } else {
            System.out.println("User " + this.userName + " is already logged in.");
        }
    }

    // Step 6: Method to log out the user
    public void logout() {
        if (isLoggedIn) {
            System.out.println("User " + userName + " logged out.");
            userName = null;
            isLoggedIn = false;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    // Step 7: Method to check if a user is logged in
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    // Step 8: Method to get the current user's name
    public String getUserName() {
        return userName;
    }
}
