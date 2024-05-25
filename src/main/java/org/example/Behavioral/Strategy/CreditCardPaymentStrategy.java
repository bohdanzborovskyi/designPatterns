package org.example.Behavioral.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private String cardNumber;
    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid using credit card. Amount: " + amount);
    }
}
