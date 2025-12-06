import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> values = new LinkedList<>();
        values.add(10);
        values.add(20);
        values.addFirst(5);
        values.addLast(30);

        System.out.println("LinkedList: " + values);

        values.removeFirst();
        values.removeLast();

        System.out.println("After Removals: " + values);
    }
}
