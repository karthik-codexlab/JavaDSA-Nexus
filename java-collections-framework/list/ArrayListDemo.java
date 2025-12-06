import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> developers = new ArrayList<>();
        developers.add("Karthik");
        developers.add("Rahul");
        developers.add("Aditi");

        System.out.println("ArrayList Elements:");
        for (String dev : developers) {
            System.out.println(dev);
        }

        developers.add(1, "Swathi");
        System.out.println("\nAfter Insertion at index 1: " + developers);

        developers.remove("Rahul");
        System.out.println("After Removal: " + developers);
    }
}
