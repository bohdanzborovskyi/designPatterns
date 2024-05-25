package org.example.Behavioral.ChainOfResponsibility;

public class FirstHandler extends Handler{

    @Override
    public void handleRequest(String request) {
        if ("Request1".equals(request)) {
            System.out.println("FirstHandler handled " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
