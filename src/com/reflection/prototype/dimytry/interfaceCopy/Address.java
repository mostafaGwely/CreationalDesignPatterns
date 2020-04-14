package com.reflection.prototype.dimytry.interfaceCopy;

public class Address implements IPrototype<Address> {
    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }



    @Override
    public Address DeepCopy() {
        return new Address(streetName, houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
