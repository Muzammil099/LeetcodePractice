package org.example.streams;

import java.util.stream.Stream;

public class ReduceExample {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1,2,4,5,6);

        int sum = integerStream.reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
