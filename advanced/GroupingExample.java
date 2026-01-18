

import java.util.*;
import java.util.stream.*;

public class GroupingExample {
    public static void main(String[] args) {
        List<String> words = List.of("java", "javascript", "python", "perl", "php");

        Map<Integer, List<String>> byLength =
                words.stream()
                     .collect(Collectors.groupingBy(String::length));

        System.out.println(byLength);
    }
}
