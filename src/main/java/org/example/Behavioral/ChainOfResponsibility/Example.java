package org.example.Behavioral.ChainOfResponsibility;

public class Example {

    public static void main(String[] args) {

        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();

        secondHandler.setSuccessor(thirdHandler);
        firstHandler.setSuccessor(secondHandler);

        firstHandler.handleRequest("Request1");
        firstHandler.handleRequest("Request2");
        firstHandler.handleRequest("Request3");
    }
}
