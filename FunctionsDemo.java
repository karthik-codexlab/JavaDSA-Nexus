// Author: Your Name
// Topic: Functions (Methods) in Java – Complete Professional Example

public class FunctionsDemo {

    // 1. Simple void function (no return type)
    public static void greet() {
        System.out.println("Hello, welcome to Java functions!");
    }

    // 2. Function with return type
    public static int add(int a, int b) {
        return a + b;
    }

    // 3. Function with multiple return statements
    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return num + " is Even";
        }
        return num + " is Odd";
    }

    // 4. Method Overloading (same name, different parameters)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // 5. Pass-by-value example
    public static void modifyValue(int x) {
        x = x + 10;
        System.out.println("Inside function, x = " + x);
    }

    // 6. Utility function: finding maximum
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // 7. Function calling another function
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // 8. Function returning an array
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    // Main Method (Driver Code)
    public static void main(String[] args) {

        // Calling simple function
        greet();

        // Function with parameters and return type
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        // Even/Odd check
        System.out.println(checkEvenOdd(7));

        // Overloading example
        System.out.println("Multiply (int): " + multiply(5, 4));
        System.out.println("Multiply (double): " + multiply(5.5, 2.0));

        // Pass-by-value demonstration
        int num = 50;
        System.out.println("Before function, num = " + num);
        modifyValue(num);
        System.out.println("After function, num = " + num);

        // Maximum of three numbers
        System.out.println("Max number: " + maxOfThree(12, 45, 7));

        // Prime check example
        System.out.println("Is 29 Prime? " + isPrime(29));

        // Function returning an array
        int[] newArray = createArray(5);
        System.out.print("Generated Array: ");
        for (int x : newArray) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
