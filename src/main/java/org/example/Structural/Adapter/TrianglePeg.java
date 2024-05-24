package org.example.Structural.Adapter;

public class TrianglePeg {

    private double side;

    public TrianglePeg(double side) {this.side = side;}

    public double getSide() {
        return side;
    }

    public double getSquare(){
        return (Math.pow(side, 2) * Math.sqrt(3))/4;
    }
}
