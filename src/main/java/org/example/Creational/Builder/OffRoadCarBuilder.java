package org.example.Creational.Builder;

public class OffRoadCarBuilder implements CarBuilder{

    private Car offroadCar = new Car();

    @Override
    public void buildEngine() {
        offroadCar.setEngine("4x4 Off-road Engine");
    }

    @Override
    public void buildWheels() {
        offroadCar.setWheels("Big 4X4 Off-road Wheels");
    }

    @Override
    public void buildColor() {
        offroadCar.setColor("Dark Color");
    }

    @Override
    public Car getCar() {
        return offroadCar;
    }
}
