package dev.duncan;

import dev.duncan.MathFunc.MathDollarCounter;
import dev.duncan.MathFunc.MathEven;
import dev.duncan.MathFunc.MathOdd;
import dev.duncan.jurassicpark.JurassicPark;
import dev.duncan.programpractice.dec_12_10_2023.ProgramAlpha;
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
        /*
        MathOdd mathOdd = new MathOdd();
        MathEven mathEven = new MathEven();
        result = mathEven.MathCounter(13);
        System.out.println("The Result Was: "+ result);
        result = mathOdd.MathCounter(12);
        System.out.println("The Result Was: "+ result);
        */
        /*
        MathDollarCounter dollarCounter = new MathDollarCounter();
        dollarCounter.weekDollarCounter(0);
        */
        /*try {
            JurassicPark.main(args);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        ProgramAlpha programAlpha = new ProgramAlpha();
        programAlpha.loopFizzBuzz(1000);
    }
}
