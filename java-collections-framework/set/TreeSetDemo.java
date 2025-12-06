import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("TreeSet (Sorted): " + numbers);
    }
}
