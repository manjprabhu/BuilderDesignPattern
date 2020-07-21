package com.btk.builderdesignpattern;

public class User {

    private String name;

    private String userId;

    private String address;

    private int age;

    private User(builder builder) {
        this.name = builder.name;
        this.userId = builder.userId;
        this.address = builder.address;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    static class builder {

        private String name;

        private String userId;

        private String address;

        private int age;

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public  builder address(String address) {
            this.address = address;
            return this;
        }

        public builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
