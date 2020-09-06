package com.abhai;
import com.abhai.mobile_phone.MobilePhone;
import java.util.Scanner;

public class Main {
    private static final String INVALID_MESSAGE = "Invalid command, try again";
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        System.out.println("Starting the phone...");
        boolean isAlive = true;

        while (isAlive) {
            System.out.println("Commands: 0 - quit, 1 - print all contacts, 2 - add new contact, 3 - update contact, 4 - remove contact, 5 - find contact");

            if (!scanner.hasNextInt()) {
                System.out.println(INVALID_MESSAGE);
            } else {
                switch (scanner.nextInt()) {
                    case 0:
                        isAlive = false;
                        break;
                    case 1:
                        mobilePhone.printContacts();
                        break;
                    case 2:
                        addNewContact();
                        break;
                    case 3:
                        updateContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        findContact();
                        break;
                    default:
                        System.out.println(INVALID_MESSAGE);
                }
            }
            scanner.nextLine();
        }
        scanner.close();
    }


    private static void addNewContact() {
        System.out.println("Enter new name and phone number");
        String name = getInputUserData();
        String phone_number = getInputUserData();

        if (checkString(name) || checkString(phone_number))
            addNewContact();
        else
            mobilePhone.addNewContact(name, phone_number);
    }


    private static boolean checkString(String string) {
        return string.equals(INVALID_MESSAGE);
    }


    private static void findContact() {
        System.out.println("Enter the name of contact which you wanna find");
        String name = getInputUserData();
        if (checkString(name))
            findContact();
        else
            System.out.println(mobilePhone.queryContact(name).toString());
    }


    private static String getInputUserData() {
        if (scanner.hasNextLine())
            return scanner.next();
        else
            return INVALID_MESSAGE;
    }


    private static void removeContact() {
        System.out.println("Enter the name of contact which you wanna delete");
        String name = getInputUserData();
        if (checkString(name))
            removeContact();
        else
            mobilePhone.removeContact(name);
    }

    private static void updateContact() {
        System.out.println("Enter the name of contact which you wanna update and new name and phone_number");
        String old_name = getInputUserData();
        String new_name = getInputUserData();
        String new_phone_number = getInputUserData();

        if (checkString(old_name) || checkString(new_name) || checkString(new_phone_number))
            updateContact();
        else if (!old_name.equals(new_name))
            mobilePhone.updateContact(old_name, new_name, new_phone_number);
        else
            System.out.println("The contact with name '" + old_name + "' already exists");
    }
}
