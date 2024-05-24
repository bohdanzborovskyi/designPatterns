package org.example.Creational.Builder;

public class Car {

    private String engine;
    private String wheels;
    private String color;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "engine='" + engine + '\'' + ", wheels='" + wheels + '\'' + ", color='" + color + '\'' + '}';
    }
}
