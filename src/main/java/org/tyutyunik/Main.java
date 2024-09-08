package org.tyutyunik;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> result1 = nums1.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(result1);

        System.out.println("\nTask 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> result2 = nums2.stream()
                .filter(num -> num % 2 == 0)
                .distinct()
                .sorted()
                .toList();
        System.out.println(result2);

        System.out.println("\nTask 3");
        List<String> words3 = Arrays.asList("кот", "собака", "птица", "кот", "рыба", "собака");
        List<String> result3 = words3.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result3);

        System.out.println("\nTask 4");
        List<String> words4 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        // Grouping
        Map<String, Long> words4Count = words4.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        // Sorting by key
        List<Map.Entry<String, Long>> result4 = words4Count.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();

        System.out.println(result4);
        for (int i = 0; i < result4.size(); i++) {
            System.out.println(result4.get(i).getValue());
        }
    }
}