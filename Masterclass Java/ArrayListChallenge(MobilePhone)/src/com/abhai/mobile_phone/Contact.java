package com.abhai.mobile_phone;

public class Contact {
    private final String name;
    private final String phone_number;



    public Contact(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }



    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name + " : " + phone_number;
    }
}
