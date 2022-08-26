package com.bridgelabz.Generics;

public class MainClass {
    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        System.out.println("Test case 1");
        maxValue.maxvalue(5, 4, 3);
        System.out.println("Test case 2");
        maxValue.maxvalue(5, 6, 3);
        System.out.println("Test case 3");
        maxValue.maxvalue(5, 4, 7);

        System.out.println("Test case 1");
        maxValue.maxvalue(0.1f, 0.2f, 0.3f);
        System.out.println("Test case 2");
        maxValue.maxvalue(1.2f, 1.3f, 0.1f);
        System.out.println("Test case 3");
        maxValue.maxvalue(2.1f, 0.3f, 2.1f);

        System.out.println("Test case 1");
        maxValue.maxvalue("Peach", "Apple", "Banana");
        System.out.println("Test case 2");
        maxValue.maxvalue("Apple", "Zach", "Banana");
        System.out.println("Test case 2");
        maxValue.maxvalue("Apple", "Banana", "Class");
    }
}
