package org.example.Creational.Prototype;

public class ConcretePrototype implements Prototype {

    private String attribute;

    public ConcretePrototype(String attribute) {this.attribute = attribute;}


    @Override
    public String toString() {
        return "ConcretePrototype{" + "attribute='" + attribute + '\'' + '}';
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.attribute);
    }

    public String getAttribute() {
        return this.attribute;
    }
}
