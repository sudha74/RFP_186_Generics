package com.bridgelabz.Generics;

public class MainClass {
    public static void main(String[] args) {
        MaxValue<Integer> maxValue = new MaxValue<>(5, 6, 7);
        maxValue.testMaximum();
        MaxValue<Float> maxValue1 = new MaxValue<>(5.2F, 6.4F, 7.3F);
        maxValue1.testMaximum();
        MaxValue<String> maxValue2 = new MaxValue<>("sudha", "rani", "kavyaMadhavan");
        maxValue2.testMaximum();
    }
}
