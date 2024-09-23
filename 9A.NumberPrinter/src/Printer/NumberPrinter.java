package Printer;

public class NumberPrinter {

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int number = i;
            Thread threadTwo = new Thread(() -> printTwo(number));
            Thread threadThree = new Thread(() -> printThree(number));
            Thread threadFour = new Thread(() -> printFour(number));
            Thread threadFive = new Thread(() -> printFive(number));
            Thread threadNumber = new Thread(() -> printNumber(number));

            threadTwo.start();
            threadThree.start();
            threadFour.start();
            threadFive.start();
            threadNumber.start();

            try {
                threadTwo.join();
                threadThree.join();
                threadFour.join();
                threadFive.join();
                threadNumber.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printTwo(int number) {
        if (number % 2 == 0) {
            System.out.println("Divisible by 2: " + number);
        }
    }

    public static void printThree(int number) {
        if (number % 3 == 0) {
            System.out.println("Divisible by 3: " + number);
        }
    }

    public static void printFour(int number) {
        if (number % 4 == 0) {
            System.out.println("Divisible by 4: " + number);
        }
    }

    public static void printFive(int number) {
        if (number % 5 == 0) {
            System.out.println("Divisible by 5: " + number);
        }
    }

    public static void printNumber(int number) {
        if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println("Number: " + number);
        }
    }
}
