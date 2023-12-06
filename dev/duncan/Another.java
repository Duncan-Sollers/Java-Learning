package dev.duncan;

import dev.duncan.wsollers.FireAlarm;

public class Another implements Greeter, FireAlarm{
    @Override
    public void sayHello(){
        System.out.println("Hello from another");
    }

    @Override
    public void sound() {
        System.out.println("jeepers");
        //throw new UnsupportedOperationException("Unimplemented method 'sound'");
    }
}
