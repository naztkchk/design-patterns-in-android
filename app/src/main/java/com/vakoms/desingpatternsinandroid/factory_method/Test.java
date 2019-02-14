package com.vakoms.desingpatternsinandroid.factory_method;

public class Test {
    public static void main(String[] args) {
        GetPhoneFactory getPhoneFactory = new GetPhoneFactory();

        Phone p = getPhoneFactory.getPhone("ANDROID");
        System.out.println(p.countOfUsers());
    }
}
