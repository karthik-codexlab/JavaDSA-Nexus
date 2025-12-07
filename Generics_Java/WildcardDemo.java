import java.util.*;

public class WildcardDemo {

    // Unbounded wildcard
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // Upper bounded wildcard
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Lower bounded wildcard
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(2.5, 3.6);

        System.out.println("Print Any List:");
        printList(intList);

        System.out.println("\nSum of Numbers:");
        System.out.println(sumOfList(intList));
        System.out.println(sumOfList(doubleList));

        System.out.println("\nLower Bounded:");
        List<Object> objList = new ArrayList<>();
        addNumbers(objList);
        System.out.println(objList);
    }
}
