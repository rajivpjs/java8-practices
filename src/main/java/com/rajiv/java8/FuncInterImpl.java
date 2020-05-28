package com.rajiv.java8;

import java.util.function.Consumer;

public class FuncInterImpl {

    public static void main(String[] args) {
        FuncInter add = (int x, int y) -> x + y;

        FuncInter multiply = (int x, int y) -> x * y;

        System.out.println(add.operation(1, 2));

        System.out.println(multiply.operation(1, 5));

        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
        consumer.accept(10);
    }
}
