package org.example.Behavioral.Command;

public class Example {

    public static void main(String[] args) {

        Light light = new Light();
        RemoteControl control = new RemoteControl();

        // Switch on the light
        control.setCommand(new LightOnCommand(light));
        control.pressButton();

        // Switch off the light
        control.setCommand(new LightOffCommand(light));
        control.pressButton();
    }
}
