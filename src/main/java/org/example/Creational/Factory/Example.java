package org.example.Creational.Factory;

public class Example {

    public static void main(String[] args) {

        Drink tea = DrinkFactory.getDrink("tea");
        Drink coffee = DrinkFactory.getDrink("coffee");

        System.out.println("Tea:");
        tea.prepare();
        System.out.println("Coffee:");
        coffee.prepare();
    }
}
