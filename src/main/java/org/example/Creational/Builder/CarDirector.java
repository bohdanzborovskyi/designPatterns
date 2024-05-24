package org.example.Creational.Builder;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct(){
        carBuilder.buildColor();
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        return carBuilder.getCar();
    }
}
