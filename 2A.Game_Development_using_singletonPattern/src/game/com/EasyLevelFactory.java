package game.com;

public class EasyLevelFactory implements AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new Pistol();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthPack();
    }
}