package com.ducks;

// 'MallardDuck' class implements the 'Duck' interface, representing a Mallard duck
public class MallardDuck implements Duck {
    
    // method to produce the sound of a Mallard duck
    public void quack() {
        System.out.println("Quack");
    }
 
    // method to simulate flying behavior of a Mallard duck
    public void fly() {
        System.out.println("I'm flying");
    }// end method 'fly'
  
}// end 'MallardDuck' class
