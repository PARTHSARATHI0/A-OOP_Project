package Liskov_substitution_principle;

//Client.java
public class Client {
public static void main(String[] args) {
   Bird sparrow = new Bird();
   Bird ostrich = new Ostrich();

   sparrow.fly(); // Works fine
   ostrich.fly(); // Throws an exception - Violates LSP
}
}
