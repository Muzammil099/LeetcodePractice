package org.example.streams;

import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,4,5,6);

        integerStream.map(num -> num * num)
            .forEach(System.out::println);
    }

}
