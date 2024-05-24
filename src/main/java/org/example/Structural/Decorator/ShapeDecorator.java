package org.example.Structural.Decorator;

public abstract class ShapeDecorator implements Shape{

    private Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
