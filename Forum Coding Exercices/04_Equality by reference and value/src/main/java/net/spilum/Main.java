package net.spilum;

public class Main {
    public static void main(String[] args) {
        int a1 = 3; // assign a1 to 3
        int b1 = a1; // assign b1 to 3 from a1
        int c1 = 3; // assign c1 to 3
        System.out.println("Example 1 (with primitive data types):");
        System.out.printf("%b, %b", a1==b1, a1==c1);
        // The above is equality by value as the variables were assigned to integers and not objects

        Customer a2 = new Customer(); // assign a2 to a new Customer object
        Customer b2 = a2; // assign b2 as a reference for the a2 Customer object
        Customer c2 = new Customer(); // assign c2 to a new Customer object
        System.out.println("\n\nExample 2 (with objects):");
        System.out.printf("%b, %b", a2==b2, a2==c2);
        // The above is equality by reference,
        // b2 is a reference for the a2 Customer object but a2 and c2 are not the same object
    }
}