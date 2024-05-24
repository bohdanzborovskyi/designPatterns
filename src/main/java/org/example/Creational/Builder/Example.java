package org.example.Creational.Builder;

public class Example {

    public static void main(String[] args) {

        CarBuilder offRoadCarBuilder = new OffRoadCarBuilder();

        CarDirector carDirector = new CarDirector(offRoadCarBuilder);

        Car offRoadCar = carDirector.construct();

        System.out.println(offRoadCar.toString());

        CarBuilder sportCarBuilder = new SportCarBuilder();

        carDirector.setCarBuilder(sportCarBuilder);

        Car sportCar = carDirector.construct();

        System.out.println(sportCar.toString());
    }
}
