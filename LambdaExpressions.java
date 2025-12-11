import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * Demonstrates professional usage of Lambda Expressions in Java.
 * Includes:
 *  - Custom functional interface
 *  - Built-in functional interfaces (Predicate, Function, Consumer, Supplier)
 *  - Stream API with Lambdas
 *  - Comparator using Lambda
 *  - Method references
 */
public class LambdaDemo {

    // Custom Functional Interface
    @FunctionalInterface
    interface Operation {
        int compute(int a, int b);
    }

    public static void main(String[] args) {

        // 1. Lambda for Custom Functional Interface
        Operation add = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;

        System.out.println("Addition: " + add.compute(10, 20));
        System.out.println("Multiplication: " + mul.compute(10, 20));

        // 2. Using Predicate (Built-in Functional Interface)
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even? " + isEven.test(7));

        // 3. Using Function<T, R>
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println("Length of 'Lambda': " + lengthFunc.apply("Lambda"));

        // 4. Using Consumer<T>
        Consumer<String> printer = msg -> System.out.println("Message: " + msg);
        printer.accept("Lambda Expressions are powerful!");

        // 5. Using Supplier<T>
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random Number: " + randomValue.get());

        // 6. Using Lambda with Stream API
        List<Integer> numbers = Arrays.asList(3, 10, 5, 20, 7, 15);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)  // Predicate
                .sorted()                // ascending sort
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // 7. Lambda-based Comparator for Custom Sorting
        List<String> names = Arrays.asList("Karthik", "Rahul", "Ananya", "Zara");

        names.sort((a, b) -> a.compareToIgnoreCase(b)); // Alphabetical sort

        System.out.println("Sorted Names: " + names);

        // 8. Method Reference (Cleaner Lambda Alternative)
        names.forEach(System.out::println);
    }
}
