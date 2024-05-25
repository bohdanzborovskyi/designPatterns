package org.example.Structural.Facade;

public class OrderServiceFacade {

    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OrderServiceFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    public boolean placeOrder(String productID){
        if(!inventory.isAvailable(productID)){
            return false;
        }
        if(!payment.processPayment(productID)){
            return false;
        }
        shipping.shipProduct(productID);
        return true;
    }
}
