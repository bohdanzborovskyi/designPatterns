package org.example.Structural.Facade;

public class Payment {

    public boolean processPayment(String orderID){
        System.out.println("Processing payment for order with ID: " + orderID);
        return true;
    }
}
