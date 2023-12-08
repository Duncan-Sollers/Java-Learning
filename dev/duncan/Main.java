package dev.duncan;

import dev.duncan.MathFunc.MathEven;
import dev.duncan.MathFunc.MathOdd;
import dev.duncan.wsollers.FireAlarm;

public class Main {
    public static void main(String [] args){
        int result = 0;
       /* 
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
        */
        MathOdd mathOdd = new MathOdd();
        MathEven mathEven = new MathEven();
        result = mathEven.MathCounter(13);
        System.out.println("The Result Was: "+ result);
        result = mathOdd.MathCounter(12);
        System.out.println("The Result Was: "+ result);
    
    }
}
