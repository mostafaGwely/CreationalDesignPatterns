package com.reflection.prototype.dimytry.copyConstructors;

public class Address {
    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public Address(Address other) {
        streetName = other.streetName;
        houseNumber = other.houseNumber;
    }


    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
