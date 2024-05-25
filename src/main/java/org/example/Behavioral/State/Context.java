package org.example.Behavioral.State;

public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
