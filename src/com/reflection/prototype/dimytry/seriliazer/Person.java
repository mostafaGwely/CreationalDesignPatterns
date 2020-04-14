package com.reflection.prototype.dimytry.seriliazer;

import java.io.*;

public class Person  implements Serializable {
    public String name;

    public Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person  deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);

        //De-serialization of object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        Person copied = (Person) in.readObject();


        return copied;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
