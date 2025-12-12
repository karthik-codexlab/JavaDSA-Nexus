package advanced;

import java.util.*;
import java.util.stream.*;

public class CustomCollectorExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        int result =
                nums.stream().collect(
                        Collectors.reducing(0, Integer::sum)
                );

        System.out.println("Custom Reduced Sum: " + result);
    }
}
