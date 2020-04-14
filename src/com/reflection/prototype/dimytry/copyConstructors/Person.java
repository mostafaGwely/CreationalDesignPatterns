package com.reflection.prototype.dimytry.copyConstructors;

public class Person    {
    public String name;
    public Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person(Person other){
        name = other.name;
        address = new Address(other.address);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
