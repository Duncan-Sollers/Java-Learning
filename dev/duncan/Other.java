package dev.duncan;

import dev.duncan.wsollers.FireAlarm;

public class Other implements Greeter, FireAlarm{
    @Override
    public void sayHello(){
        System.out.println("Hello from Other");
    }

    @Override
    public void sound() {
        System.out.println("Creepers");
    }
    @Override
    public void stop() {
        System.out.println("Can't stop");
    }
}