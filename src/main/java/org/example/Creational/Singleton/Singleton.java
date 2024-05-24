package org.example.Creational.Singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(singleton == null){
            return new Singleton();
        }else {
            return singleton;
        }
    }
}
