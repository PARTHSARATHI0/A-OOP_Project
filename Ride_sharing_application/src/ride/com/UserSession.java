package ride.com;

public class UserSession {
    private static UserSession instance;
    private String userId;
    private boolean isAuthenticated;

    private UserSession() {
        this.isAuthenticated = false;
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void login(String userId) {
        this.userId = userId;
        this.isAuthenticated = true;
        System.out.println("User " + userId + " logged in.");
    }

    public void logout() {
        this.userId = null;
        this.isAuthenticated = false;
        System.out.println("User logged out.");
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public String getUserId() {
        return userId;
    }
}
