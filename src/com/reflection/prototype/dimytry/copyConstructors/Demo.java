package com.reflection.prototype.dimytry.copyConstructors;

public class Demo {
  public static void main(String[] args) {
    var john = new Person("john", new Address("address1", 123));
    var mostafa = new Person(john);

    mostafa.name =  "mostafa";
    mostafa.address.houseNumber = 4;
    System.out.println(john);
    System.out.println(mostafa);
  }
}
