package com.reflection.factory.method;

public class Blog extends Website {
    @Override
    protected void createWebSite() {
        pages.add(new About());
        pages.add(new Products());
    }
}
