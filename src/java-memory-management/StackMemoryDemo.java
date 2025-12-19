package java_memory_management;

/**
 * Demonstrates Stack memory usage.
 * Each method call creates a new stack frame.
 */
public class StackMemoryDemo {

    public static void main(String[] args) {
        methodA();
    }

    private static void methodA() {
        int a = 10;
        methodB();
    }

    private static void methodB() {
        int b = 20;
        methodC();
    }

    private static void methodC() {
        int c = 30;
        System.out.println("Execution completed");
    }
}
