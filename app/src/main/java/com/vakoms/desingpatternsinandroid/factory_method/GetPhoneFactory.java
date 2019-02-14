package com.vakoms.desingpatternsinandroid.factory_method;

public class GetPhoneFactory {

    Phone getPhone (String name) {
        if (name.equals("ANDROID")) {
            return new Android();
        }

        if (name.equals("IPHONE")) {
            return new Iphone();
        }
        return null;
    }
}
