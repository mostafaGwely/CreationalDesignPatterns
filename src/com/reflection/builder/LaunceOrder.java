package com.reflection.builder;

public class LaunceOrder {


    public static class Builder {
        private String meat;
        private String bread;
        private String condiments;

        public LaunceOrder build() {
            return new LaunceOrder(this);
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

    }

    private String meat;
    private String bread;
    private String condiments;

    public LaunceOrder(Builder builder) {
        this.meat = builder.meat;
        this.bread = builder.bread;
        this.condiments = builder.condiments;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }
}
