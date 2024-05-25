package org.example.Behavioral.State;

public class StopState implements State{

    @Override
    public void handleRequest() {
        System.out.println("Stopping...");
    }
}
