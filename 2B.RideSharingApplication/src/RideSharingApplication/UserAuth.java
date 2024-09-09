package RideSharingApplication;

//UserAuth.java
public class UserAuth {
 private static UserAuth instance;
 private String currentUser;

 private UserAuth() {
     currentUser = "Guest";
 }

 public static synchronized UserAuth getInstance() {
     if (instance == null) {
         instance = new UserAuth();
     }
     return instance;
 }

 public String getCurrentUser() {
     return currentUser;
 }

 public void login(String username) {
     currentUser = username;
     System.out.println(username + " has logged in.");
 }

 public void logout() {
     System.out.println(currentUser + " has logged out.");
     currentUser = "Guest";
 }
}
