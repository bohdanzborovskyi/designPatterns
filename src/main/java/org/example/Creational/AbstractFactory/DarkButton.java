package org.example.Creational.AbstractFactory;

public class DarkButton implements Button{

    @Override
    public void click() {
        System.out.println("Clicked dark button");
    }
}
