package com.reflection.prototype.dimytry.clonable;

public class Demo {
  public static void main(String[] args) {
    var john = new Person("john", new Address("address1", 123));
    var mostafa = john.clone();

    mostafa.name =  "mostafa";
    mostafa.address.houseNumber = 4;
    System.out.println(john);
    System.out.println(mostafa);
  }
}
