package game.com;

public class HardLevelFactory implements AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new MachineGun();
    }

    @Override
    public PowerUp createPowerUp() {
        return new Shield();
    }
}
