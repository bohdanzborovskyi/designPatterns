package org.example.Structural.Decorator;

public class RedColorShapeDecorator extends ShapeDecorator{


    protected RedColorShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawRedColor();
    }

    private void drawRedColor() {
        System.out.println("Red Color was added to Shape");
    }
}
