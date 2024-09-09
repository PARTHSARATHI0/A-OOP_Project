package game.com;

//GameState.java
public class GameState {
 private static GameState instance;

 private int level;

 private GameState() {
     level = 1; // Default level
 }

 public static synchronized GameState getInstance() {
     if (instance == null) {
         instance = new GameState();
     }
     return instance;
 }

 public int getLevel() {
     return level;
 }

 public void setLevel(int level) {
     this.level = level;
 }
}
