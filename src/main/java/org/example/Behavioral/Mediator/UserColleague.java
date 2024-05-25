package org.example.Behavioral.Mediator;

public class UserColleague extends Colleague {

    public UserColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("UserColleague Received: " + message);
    }
}
