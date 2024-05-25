package org.example.Structural.Flyweight;

public class Circle implements Shape{

    private String color;

    public Circle(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing Circle with Color: " + this.color + ", X: " + x + ", Y: " + y + ", Width: " + width + ", Height: " + height);
    }
}
