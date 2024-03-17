package org.MTH;

import java.util.Arrays;

public class NameRepo {

    private String[] names;

    public NameRepo(int size) {
        names = new String[size];
    }

    public void addName(String firstName, String lastName, int index) {
        if (index >= 0 && index < names.length) {
            names[index] = formatName(firstName, lastName);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void printNames() {
        for (String name : names) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }

    private String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        NameRepo storage = new NameRepo(5);
        storage.addName("Erik", "Svensson", 0);
        storage.addName("Anna", "Andersson", 1);
        storage.addName("John", "Hans", 2);
        storage.addName("Jane", "Hans", 3);
        storage.addName("Alice", "Smith", 4);

        System.out.println("Names stored:");
        storage.printNames();
    }
}
