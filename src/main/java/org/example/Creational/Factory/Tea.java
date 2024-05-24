package org.example.Creational.Factory;

public class Tea implements Drink{

    @Override
    public void prepare() {
        System.out.println("Preparing tea");
    }
}
