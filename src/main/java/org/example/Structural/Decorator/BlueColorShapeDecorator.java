package org.example.Structural.Decorator;

public class BlueColorShapeDecorator extends ShapeDecorator{


    protected BlueColorShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawRedColor();
    }

    private void drawRedColor() {
        System.out.println("Blue Color was added to Shape");
    }
}
