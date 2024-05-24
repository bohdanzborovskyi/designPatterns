package org.example.Creational.Singleton;

public class Example {

    public static void main(String[] args) {

        // Impossible because constructor is private
//        Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();
    }
}
