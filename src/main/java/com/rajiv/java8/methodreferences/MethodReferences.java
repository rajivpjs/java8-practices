package com.rajiv.java8.methodreferences;

import com.rajiv.java8.ComputeOperation;
import com.rajiv.java8.SimplePrinter;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReferences {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(element -> SimplePrinter.print(element, element));

        System.out.println();
        list.forEach(SimplePrinter::print);

        System.out.println();

        Consumer<Integer> consumer = ComputeOperation::new;
        consumer.accept(10);

        System.out.println();
        BiConsumer<Integer, Integer> computeOperation = ComputeOperation::new;
        computeOperation.accept(20, 30);
        System.out.println();

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 10);
    }
}
