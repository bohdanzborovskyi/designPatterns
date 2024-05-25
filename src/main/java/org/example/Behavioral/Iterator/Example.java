package org.example.Behavioral.Iterator;

public class Example {

    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection();
        Iterator<String> iterator = collection.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
