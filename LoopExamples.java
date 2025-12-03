/**
 * LoopExamples.java
 *
 * A comprehensive and production-quality demonstration of all loop constructs in Java.
 * This file covers:
 * - for loop
 * - enhanced for loop (for-each)
 * - while loop
 * - do-while loop
 * - nested loops
 * - loop control statements (break, continue)
 * - loop best practices and real-world usage examples
 *
 * Author: [Your Name]
 * Date: 2025
 */

public class LoopExamples {

    public static void main(String[] args) {

        basicForLoop();
        enhancedForLoop();
        basicWhileLoop();
        basicDoWhileLoop();
        nestedLoops();
        loopControlStatements();
    }

    /**
     * Demonstrates a traditional for loop with initialization, condition, and iteration.
     */
    public static void basicForLoop() {
        System.out.println("=== Basic For Loop ===");

        // Print numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // For loop with step size
        for (int i = 0; i <= 20; i += 5) {
            System.out.println("Step Value: " + i);
        }

        System.out.println();
    }

    /**
     * Demonstrates an enhanced for loop (for-each), widely used for collections/arrays.
     */
    public static void enhancedForLoop() {
        System.out.println("=== Enhanced For Loop (For-Each) ===");

        int[] marks = {92, 85, 76, 88, 95};

        for (int mark : marks) {
            System.out.println("Student Mark: " + mark);
        }

        System.out.println();
    }

    /**
     * Demonstrates a while loop, commonly used when the number of iterations is unknown.
     */
    public static void basicWhileLoop() {
        System.out.println("=== While Loop ===");

        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Real-world example: waiting for a process to complete
        boolean isTaskCompleted = false;
        int retry = 0;

        while (!isTaskCompleted && retry < 3) {
            System.out.println("Attempting task... Attempt: " + (retry + 1));
            retry++;

            // Simulated task completion on retry 2
            if (retry == 2) {
                isTaskCompleted = true;
            }
        }

        System.out.println("Task Completed: " + isTaskCompleted);
        System.out.println();
    }

    /**
     * Demonstrates a do-while loop which always executes at least once.
     */
    public static void basicDoWhileLoop() {
        System.out.println("=== Do-While Loop ===");

        int x = 1;

        do {
            System.out.println("Value of x: " + x);
            x++;
        } while (x <= 5);

        // Real-world example: menu-driven applications
        int option = 1;
        do {
            System.out.println("Menu Option: " + option);
            option++;
        } while (option <= 3);

        System.out.println();
    }

    /**
     * Demonstrates nested loops, commonly used for matrix operations or patterns.
     */
    public static void nestedLoops() {
        System.out.println("=== Nested Loops ===");

        // Print a 3x3 matrix
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }

        System.out.println();
    }

    /**
     * Demonstrates break and continue statements.
     */
    public static void loopControlStatements() {
        System.out.println("=== Loop Control Statements ===");

        // Break example: exit loop when condition is met
        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        // Continue example: skip the iteration for i = 5
        System.out.println("\nContinue Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println();
    }
}
