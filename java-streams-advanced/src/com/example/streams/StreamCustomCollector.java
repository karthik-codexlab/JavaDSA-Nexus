package com.example.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCustomCollector {

    // Custom collector to collect uppercase names into a Set
    public static Collector<String, ?, Set<String>> toUppercaseSet() {
        return Collectors.mapping(
                String::toUpperCase,
                Collectors.toSet()
        );
    }

    public static Set<String> collectUppercaseNames(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getName)
                .collect(toUppercaseSet());
    }
}
