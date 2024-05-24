package org.example.Creational.Builder;

public class SportCarBuilder implements CarBuilder{

    private Car sportCar = new Car();

    @Override
    public void buildEngine() {
        sportCar.setEngine("Sport Engine");
    }

    @Override
    public void buildWheels() {
        sportCar.setWheels("Racing Wheels");
    }

    @Override
    public void buildColor() {
        sportCar.setColor("Red Color");
    }

    @Override
    public Car getCar() {
        return sportCar;
    }
}
