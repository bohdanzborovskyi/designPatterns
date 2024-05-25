package org.example.Behavioral.Mediator;

abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }
    public abstract void receive(String message);
}
