import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<String, String> languages = new LinkedHashMap<>();
        languages.put("JS", "JavaScript");
        languages.put("RB", "Ruby");
        languages.put("PY", "Python");

        System.out.println("LinkedHashMap (Insertion Order): " + languages);
    }
}
