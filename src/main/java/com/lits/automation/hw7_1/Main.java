package com.lits.automation.hw7_1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaa", "bbb", "ccca", "ddd","ccca");

        Set<String> strings1 = strings.stream()
                .map(s -> s.toUpperCase())
                .distinct()
                .collect(Collectors.toSet());

        strings1.stream().forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);

        Set<Integer> integers1 = integers.stream()
                .filter(s -> s%2 == 0)
                .limit(2)
                .collect(Collectors.toSet());
        integers1.stream().forEach(System.out::println);

    }
}
