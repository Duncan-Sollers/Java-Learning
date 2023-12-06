package dev.duncan;

import dev.duncan.wsollers.FireAlarm;

public class Main {
    public static void main(String [] args){
        System.out.println("Hello World.");
        Greeter greeter = new Other();
        greeter.sayHello();
        greeter = new Another();
        greeter.sayHello();
        FireAlarm firealarm = new Other();
        firealarm.sound();
        firealarm.stop();
        firealarm = new Another();
        firealarm.sound();
        firealarm.stop();
    }
}
