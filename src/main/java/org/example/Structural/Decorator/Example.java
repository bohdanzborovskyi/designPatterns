package org.example.Structural.Decorator;

public class Example {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape circleWithRedAndBlack = new BlueColorShapeDecorator(new RedColorShapeDecorator(new Circle()));
        Shape rectangleWithRedAndWhite = new WhiteColorShapeDecorator( new RedColorShapeDecorator(new Rectangle()));


        System.out.println("-------------------------------------------------------------");
        circle.draw();
        System.out.println("-------------------------------------------------------------");
        circleWithRedAndBlack.draw();
        System.out.println("-------------------------------------------------------------");
        rectangleWithRedAndWhite.draw();
        System.out.println("-------------------------------------------------------------");
    }
}
