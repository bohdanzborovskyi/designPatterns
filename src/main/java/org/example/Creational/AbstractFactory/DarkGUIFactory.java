package org.example.Creational.AbstractFactory;

public class DarkGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Window createWindow() {
        return new DarkWindow();
    }
}
