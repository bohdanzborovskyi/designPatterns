package org.example.Structural.Facade;

public class Example {

    public static void main(String[] args) {
        OrderServiceFacade orderSerice = new OrderServiceFacade();
        boolean isOrderPlaced = orderSerice.placeOrder("12943");
        System.out.println("Order placed successfully: " + isOrderPlaced);
    }
}
