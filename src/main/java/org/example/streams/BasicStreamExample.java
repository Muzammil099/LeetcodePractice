package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Convert the list to a stream
        Stream<Integer> numberStream = numbers.stream();

        // Print each element of the stream
        numberStream.forEach(System.out::println);
    }
}

