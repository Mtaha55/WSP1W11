package org.MTH;

public class App {

    public static void main(String[] args) {
        // Create an instance of NameStorage with size 5
        NameRepo storage = new NameRepo(5);

        // Add names
        storage.addName("Erik", "Svensson", 0);
        storage.addName("Anna", "Andersson", 1);
        storage.addName("John", "Doe", 2);
        storage.addName("Jane", "Doe", 3);
        storage.addName("Alice", "Smith", 4);

        // Print stored names
        System.out.println("Names stored:");
        storage.printNames();
    }
}
