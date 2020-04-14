package com.reflection.prototype.dimytry.interfaceCopy;

public class Person implements IPrototype<Person>{
    public String name;
    public Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Person DeepCopy() {
        return new Person(name, address.DeepCopy());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
