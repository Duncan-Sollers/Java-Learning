package dev.duncan;
public class Main {
    public static void main(String [] args){
        System.out.println("Hello World.");
        Greeter greeter = new Other();
        greeter.sayHello();
        greeter = new Another();
        greeter.sayHello();
    }
}
