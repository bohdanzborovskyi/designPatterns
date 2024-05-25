package org.example.Structural.Flyweight;

public class Example {

    private static final String[] colors = {"Red", "Blue", "Yellow", "Green"};

    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(), getRandomY(), 50, 50, circle.getColor());
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100);
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
