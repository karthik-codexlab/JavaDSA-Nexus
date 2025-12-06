import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> tasks = new ArrayDeque<>();

        tasks.add("Task1");
        tasks.addFirst("HighPriority");
        tasks.addLast("LowPriority");

        System.out.println("ArrayDeque: " + tasks);

        tasks.removeFirst();
        System.out.println("After removeFirst: " + tasks);
    }
}
