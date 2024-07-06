package org.example.streams;

import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("Alice", "Bob","David");

        stringStream
            .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}

