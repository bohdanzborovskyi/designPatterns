package org.example.Creational.Builder;

public interface CarBuilder {

    void buildEngine();
    void buildWheels();
    void buildColor();
    Car getCar();

}
