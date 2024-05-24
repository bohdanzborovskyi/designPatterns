package org.example.Structural.Adapter;

public class Example {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(roundHole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(3);
        SquarePeg largeSquarePeg = new SquarePeg(20);
        TrianglePeg smallTrianglePeg = new TrianglePeg(2);
        TrianglePeg largeTrianglePeg = new TrianglePeg(20);
//        Didn't compile
//        roundHole.fits(smallSquarePeg);
//        roundHole.fits(smallTrianglePeg);

        RoundPegAdapter roundPegAdapter = new RoundPegAdapter();
        roundPegAdapter.setSquarePeg(smallSquarePeg);
        if(roundHole.fits(roundPegAdapter)){
            System.out.println("Square peg r3 fits round hole r3.");
        }
        roundPegAdapter.setSquarePeg(largeSquarePeg);
        if(!roundHole.fits(roundPegAdapter)){
            System.out.println("Square peg r20 doesn't fits round hole r20.");
        }
        roundPegAdapter.setTrianglePeg(smallTrianglePeg);
        if(roundHole.fits(roundPegAdapter)){
            System.out.println("Triangle peg r2 fits round hole r2.");
        }
        roundPegAdapter.setTrianglePeg(largeTrianglePeg);
        if(!roundHole.fits(roundPegAdapter)){
            System.out.println("Triangle peg r20 doesn't fits round hole r20.");
        }
    }
}