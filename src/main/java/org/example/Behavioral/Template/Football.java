package org.example.Behavioral.Template;

public class Football extends Game{

    @Override
    protected void startPlay() {
        System.out.println("Football game started.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football game finished.");
    }
}
