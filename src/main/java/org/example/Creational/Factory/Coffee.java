package org.example.Creational.Factory;

public class Coffee implements Drink{

    @Override
    public void prepare() {
        System.out.println("Preparing coffee");
    }
}
