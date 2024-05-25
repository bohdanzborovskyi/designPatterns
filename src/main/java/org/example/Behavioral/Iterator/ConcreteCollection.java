package org.example.Behavioral.Iterator;

public class ConcreteCollection {

    private final String[] items = {"item1", "item2", "item3", "item4"};

    public Iterator<String> getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator<String> {
        int index;

        public boolean hasNext() {
            return index < items.length;
        }

        public String next() {
            if(this.hasNext()) {
                return items[index++];
            }
            return null;
        }
    }
}
