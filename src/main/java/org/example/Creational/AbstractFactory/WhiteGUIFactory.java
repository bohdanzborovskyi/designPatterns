package org.example.Creational.AbstractFactory;

public class WhiteGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WhiteButton();
    }

    @Override
    public Window createWindow() {
        return new WhiteWindow();
    }
}
