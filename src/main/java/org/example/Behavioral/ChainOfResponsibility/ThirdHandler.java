package org.example.Behavioral.ChainOfResponsibility;

public class ThirdHandler extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("Request3".equals(request)) {
            System.out.println("ThirdHandler handled " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
