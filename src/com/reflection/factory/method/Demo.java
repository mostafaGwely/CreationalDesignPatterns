package com.reflection.factory.method;

public class Demo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());
    }
}
