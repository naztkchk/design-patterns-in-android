package com.vakoms.desingpatternsinandroid.builder;

public class Test {
    public static void main(String[] args) {
        new User.Builder()
                .setFirstName("Nazar")
                .setLastName("Tkachuk")
                .setAge(99)
                .create();
    }
}
