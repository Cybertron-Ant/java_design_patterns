package com.ducks;

// class 'DuckTestDrive' to test 'duck' behavior
public class DuckTestDrive {

    // Main method to test 'duck' functionalities
    public static void main(String[] args) {
        Duck duck = new MallardDuck(); // creating a Mallard duck instance

        System.out.println("\nThe Duck says..."); // printing 'duck' behavior

        testDuck(duck); // testing the behavior of the duck

    }// end method 'main'

    // method 'testDuck' to test the behavior of a Duck
    static void testDuck(Duck duck) {
        duck.quack(); // Performing quack behavior
        duck.fly();   // Performing fly behavior
    }// end method 'testDuck'
  
}// end class 'DuckTestDrive'
