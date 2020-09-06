package com.abhai.mobile_phone;

import java.util.ArrayList;

public class MobilePhone {
    private final ArrayList<Contact> contacts;



    public MobilePhone() {
        contacts = new ArrayList<>();
    }



    public void addNewContact(String name, String phone_number) {
        if (!contacts.contains(queryContact(name)))
            contacts.add(new Contact(name, phone_number));
        else
            System.out.println("The contact with name '" + name + "' already exists");
    }


    public Contact queryContact(String name) {
        for (Contact contact : contacts)
            if (contact.getName().equals(name))
                return contact;
        return new Contact("Didn't find the contact with this name", " ");
    }


    public void printContacts() {
        for (Contact contact : contacts)
            System.out.println(contact.toString());
    }


    public void removeContact(String name) {
        if (!contacts.remove(queryContact(name)))
            System.out.println("Failed to delete contact");
    }


    public void updateContact(String old_name, String new_name, String new_phone_number) {
        Contact contact = queryContact(old_name);

        if (contacts.contains(contact)) {
            contacts.set(contacts.indexOf(contact), new Contact(new_name, new_phone_number));
        } else
            System.out.println("Couldn't find the contact");
    }
}
