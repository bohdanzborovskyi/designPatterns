package org.example.Behavioral.Observer;

public class Example {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.register(observer1);
        subject.register(observer2);

        subject.setState("New State 1");
        subject.setState("New State 2");
    }
}
