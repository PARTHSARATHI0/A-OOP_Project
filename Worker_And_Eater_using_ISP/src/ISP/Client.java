package ISP;

public class Client {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Human human = new Human();

        robot.work();
        human.work();
        human.eat();
    }
}