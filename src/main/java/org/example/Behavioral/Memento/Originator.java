package org.example.Behavioral.Memento;

public class Originator {

    private String state;

    // Sets the state
    public void setState(String state) {
        this.state = state;
    }

    // Gets the state
    public String getState() {
        return state;
    }

    // Saves the current state and returns a new Memento with the saved state
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // Restores the state from a Memento
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
