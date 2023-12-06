package dev.duncan.wsollers;

public interface FireAlarm {

    public void sound();

    default public void stop() {
      System.out.println("Fire alarm stopped");
    }
}
