package org.example.Creational.AbstractFactory;

public class Example {

    public static void main(String[] args) {

        GUIFactory factory = new DarkGUIFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.click();
        window.open();

        factory = new WhiteGUIFactory();
        button = factory.createButton();
        window = factory.createWindow();

        button.click();
        window.open();

    }
}
