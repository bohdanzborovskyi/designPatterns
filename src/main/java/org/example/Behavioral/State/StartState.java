package org.example.Behavioral.State;

public class StartState implements State{

    @Override
    public void handleRequest() {
        System.out.println("Starting...");
    }
}
