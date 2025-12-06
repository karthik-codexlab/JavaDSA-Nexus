import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Hyderabad"); // Duplicate ignored

        System.out.println("HashSet (Unordered): " + cities);

        System.out.println("Contains Chennai? " + cities.contains("Chennai"));
    }
}
