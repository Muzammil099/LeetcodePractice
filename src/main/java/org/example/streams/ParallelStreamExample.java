package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Convert the list to a parallel stream
        numbers.parallelStream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}

