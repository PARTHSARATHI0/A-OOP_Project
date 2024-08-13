package game.com;

//Game.java
public class Game {
 public static void main(String[] args) {
     GameState gameState = GameState.getInstance();

     // Example: Playing on an easy level
     gameState.setLevel(1);

     AbstractFactory factory = new EasyLevelFactory();
     Weapon weapon = factory.createWeapon();
     PowerUp powerUp = factory.createPowerUp();

     weapon.use();
     powerUp.activate();

     // Example: Creating enemies based on difficulty
     EnemyFactory enemyFactory = new EasyEnemyFactory();
     Enemy enemy = enemyFactory.createEnemy();
     enemy.attack();
 }
}
