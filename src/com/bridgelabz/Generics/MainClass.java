package com.bridgelabz.Generics;

public class MainClass {
    public static void main(String[] args) {
        MaxFloat maxFloat = new MaxFloat();
        System.out.println("Test case 1");
        maxFloat.maxvalue(7.2F, 5.3F, 6.2F);
        System.out.println("Test case 2");
        maxFloat.maxvalue(5.4F, 6.5F, 4.5F);
        System.out.println("Test case 3");
        maxFloat.maxvalue(5.3F, 6.6F, 8.7F);
    }
}
