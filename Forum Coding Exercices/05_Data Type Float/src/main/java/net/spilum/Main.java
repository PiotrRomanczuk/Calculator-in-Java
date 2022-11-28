package net.spilum;

public class Main {
    public static void main(String[] args) {
        // float x = 1234.123; The data type of x is interpreted as a double but should be declared as a float
        float x1 = (float)1234.123; // Declare the value as a float with (float)
        float x2 = 1234.123f; // Declare the value as a float with 'f' at the end
        double y = 1234.123;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(y);
    }
}