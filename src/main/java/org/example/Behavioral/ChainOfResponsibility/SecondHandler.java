package org.example.Behavioral.ChainOfResponsibility;

public class SecondHandler extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("Request2".equals(request)) {
            System.out.println("SecondHandler handled " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
