package org.example.Behavioral.Template;

abstract class Game {

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    // Default implementation of steps
    protected void initialize() {
        System.out.println("Game initialized.");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void startPlay();
    protected abstract void endPlay();

}
