package org.example.arrays;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        IntSummaryStatistics summaryStatistics = numbers.stream()
            .mapToInt(x -> x)
                .summaryStatistics();

        System.out.println(summaryStatistics.getAverage());
    }
}
