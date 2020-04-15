package com.reflection.factory.method;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType type) {
        switch (type) {
            case  BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
