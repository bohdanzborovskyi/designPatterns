package org.example.Behavioral.State;

public class Example {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        context.setState(startState);
        context.request();

        StopState stopState = new StopState();
        context.setState(stopState);
        context.request();
    }
}
