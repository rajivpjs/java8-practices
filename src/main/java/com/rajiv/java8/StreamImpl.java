package com.rajiv.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamImpl {

    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        System.out.println(stream.count());

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamCollection = collection.stream();
        streamCollection.forEach(s -> System.out.println(s));

        Stream<String> stream2 = Stream.of("a", "b", "c");
        stream2.forEach(a -> System.out.println(a));

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        streamGenerated.forEach(g -> System.out.println(g));

        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        streamIterated.forEach(i -> System.out.println(i));
        System.out.println();

        IntStream intStream = IntStream.range(1, 101);
        intStream.forEach(i -> System.out.println(i));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1, 100);
        longStream.forEach(i -> System.out.println(i));

//        OptionalLong optionalLong = longStream.findAny();

        Stream<String> compile = Pattern.compile(",").splitAsStream("a, b, c");
        compile.forEach(i -> System.out.println(i));

        System.out.println();
        List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b")).collect(Collectors.toList());
        System.out.println(elements);

        System.out.println();
        List<String> list = Stream.of("a", "b", "c").skip(1).collect(Collectors.toList());
        System.out.println(list);

        System.out.println();
        Stream<String> stream3 = Stream.of("abe2", "abfd2", "abc").skip(1).map(element -> element.substring(0, 3)).sorted();
        stream3.forEach(i -> System.out.println(i));

        System.out.println();
        long count = Stream.of("abe2", "abfd2", "abc").skip(1).map(element -> element.substring(0, 3)).sorted().count();
        System.out.println(count);

        System.out.println();
        Optional<Integer> ints = Stream.of(1, 2, 3).reduce((a, b) -> a + b);
        System.out.println(ints);

        System.out.println();
        Integer ints2 = Stream.of(1, 2, 3).reduce(10, (a, b) -> a + b);
        System.out.println(ints2);

        System.out.println();
        LongStream longStream2 = LongStream.rangeClosed(1, 3);
        longStream2.forEach(System.out::println);

//        Function<String, Boolean> function = String::equals;
    }
}
