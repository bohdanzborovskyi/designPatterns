package org.example.Behavioral.Mediator;

public class Example {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        UserColleague user1 = new UserColleague(mediator);
        UserColleague user2 = new UserColleague(mediator);
        UserColleague user3 = new UserColleague(mediator);

        mediator.register(user1);
        mediator.register(user2);
        mediator.register(user3);

        user1.send("Hello from User 1!");
    }
}
