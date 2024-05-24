package org.example.Structural.Adapter;

public class RoundPegAdapter extends RoundPeg{

    private SquarePeg squarePeg;
    private TrianglePeg trianglePeg;

    public RoundPegAdapter() {}

    @Override
    public double getRadius() {
        if(squarePeg != null) {
            return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        }
        else {
            return Math.sqrt(3) * trianglePeg.getSide();
        }

    }

    public void setTrianglePeg(TrianglePeg trianglePeg) {
        this.trianglePeg = trianglePeg;
        this.squarePeg = null;
    }

    public void setSquarePeg(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
        this.trianglePeg = null;
    }
}
