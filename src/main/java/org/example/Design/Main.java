package org.example.Design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emily");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("asdsad");
        names.stream().forEach(System.out::println);

        System.out.println("asdsad");


        names.stream()
            .parallel()
            .forEach(System.out::println);

        List<String> aa = new ArrayList<>();
        // Define a Consumer to print each name
        Consumer<String> namePrinter = (name) ->  {
            System.out.println("Hello, " + name);
            aa.add(name);
            };

        // Use the Consumer to process each name in the list
        names.forEach(namePrinter);


        Calculator adder = (a, b) -> a + b;

        // Use the lambda expression to perform addition
        int result = adder.calculate(5, 3);
        System.out.println("Result of addition: " + result);

    }
}

