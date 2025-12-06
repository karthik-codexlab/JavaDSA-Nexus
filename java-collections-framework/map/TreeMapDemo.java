import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> students = new TreeMap<>();
        students.put(103, "Ravi");
        students.put(101, "Karthik");
        students.put(102, "Aditi");

        System.out.println("TreeMap (Sorted by Key): " + students);
    }
}
