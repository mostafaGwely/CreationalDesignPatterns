package com.reflection.factory.method;

public class Shop extends Website {
    @Override
    protected void createWebSite() {
        pages.add(new Products());
        pages.add(new About());
    }
}
