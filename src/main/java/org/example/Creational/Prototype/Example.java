package org.example.Creational.Prototype;

public class Example {

    public static void main(String[] args) {

        ConcretePrototype original = new ConcretePrototype("Original");
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println(original.toString());
        System.out.println(clone.toString());
    }
}
