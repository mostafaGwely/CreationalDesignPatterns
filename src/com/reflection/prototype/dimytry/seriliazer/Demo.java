package com.reflection.prototype.dimytry.seriliazer;

import java.io.IOException;

public class Demo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    var john = new Person("john", new Address("address1", 123));

    var mostafa = john.deepCopy();

    mostafa.name =  "mostafa";
    mostafa.address.houseNumber = 4;
    System.out.println(john);
    System.out.println(mostafa);
  }
}
