package org.example.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyExample {

    public static void main(String[] args) {
        String text = "Java streams are a powerful feature for processing collections of data. for";

        // Count frequency of each word
        Map<String, Long> wordFrequency = Arrays.stream(text.split("\\s+"))
            .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Word Frequency: " + wordFrequency);
    }
}
