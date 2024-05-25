package org.example.Behavioral.Memento;

public class Example {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker caretaker = new CareTaker();

        originator.setState("State #1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        System.out.println("Current State: " + originator.getState());

        // Restore state from the first memento
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("Restored State: " + originator.getState());
    }
}
