package org.example.Structural.Decorator;

public class WhiteColorShapeDecorator extends ShapeDecorator{


    protected WhiteColorShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawRedColor();
    }

    private void drawRedColor() {
        System.out.println("White Color was added to Shape");
    }
}
