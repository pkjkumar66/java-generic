package com.pkj.generic;

public class main {
    public static void main(String[] args) {
        // Example 1
        MyClass<Integer, Double> obj1 = new MyClass<>(10, 20.0);
        obj1.showType();

        // Example 2
        NumericFxns<Integer> numericFxns = new NumericFxns<>(2);
        System.out.println(numericFxns.square());

        // Example 3
        WildCard<Integer> integerWildCard = new WildCard<>(6);
        WildCard<Double> doubleWildCard = new WildCard<>(-6.0);
        System.out.println(integerWildCard.absEqual(doubleWildCard));
    }
}
