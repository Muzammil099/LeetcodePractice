package org.example.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomCollectorExample {
    public static void main(String[] args) {
        // Create a stream of strings
        Stream<String> words = Stream.of("hello", "world", "java");

        // Collect words into a single string separated by commas
        String result = words.collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

