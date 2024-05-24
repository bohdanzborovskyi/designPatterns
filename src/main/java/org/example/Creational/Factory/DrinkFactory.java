package org.example.Creational.Factory;

public class DrinkFactory {

    public static Drink getDrink(String drinkType){

        if(drinkType == null){
            return null;
        }
        if(drinkType.equalsIgnoreCase("COFFEE")){
            return new Coffee();
        }
        if(drinkType.equalsIgnoreCase("TEA")){
            return new Tea();
        }
        return null;
    }
}
