package advanced;

import java.util.*;
import java.util.stream.*;

public class PartitioningExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 5, 25, 3, 40);

        Map<Boolean, List<Integer>> partition =
                nums.stream()
                    .collect(Collectors.partitioningBy(n -> n > 10));

        System.out.println(partition);
    }
}
