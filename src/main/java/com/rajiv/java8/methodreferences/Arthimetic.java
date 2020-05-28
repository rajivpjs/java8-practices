package com.rajiv.java8.methodreferences;

import java.util.function.BiFunction;

public class Arthimetic {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arthimetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
