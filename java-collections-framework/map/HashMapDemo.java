import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Math", 95);
        marks.put("Physics", 90);
        marks.put("Chemistry", 92);

        System.out.println("HashMap (Unordered):");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        marks.put("Math", 98); // Update value
        System.out.println("Updated Math Marks: " + marks.get("Math"));
    }
}
