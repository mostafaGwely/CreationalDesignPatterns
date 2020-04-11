package com.reflection.builder;

public class Demo {
    public static void main(String[] args) {
        LaunceOrder.Builder builder = new LaunceOrder.Builder();
        builder.meat("ham").condiments("condiments").bread("toast");

        //notice the immutability
        LaunceOrder launceOrder = builder.build();

        System.out.println(launceOrder.getCondiments());
    }
}
