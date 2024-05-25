package org.example.Structural.Proxy;

public class Example {

    public static void main(String[] args) {

        Image image = new ProxyImage("image.png");
//      Image will be loaded from disk
        image.display();
        System.out.println("---------------------------------");
//      Image will not be loaded from disk
        image.display();
    }
}
