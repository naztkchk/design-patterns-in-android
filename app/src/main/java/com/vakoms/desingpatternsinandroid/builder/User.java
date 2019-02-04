package com.vakoms.desingpatternsinandroid.builder;

class User {
    private String firstName;
    private String lastName;
    private Integer age;

    private User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
    }

    static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        Builder setFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        Builder setLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        Builder setAge(final int age) {
            this.age = age;
            return this;
        }

        User create() {
            return new User(this);
        }
    }
}


