public class ControlFlow {

    public static void main(String[] args) {

        System.out.println("=== CONTROL FLOW STATEMENTS IN JAVA ===\n");

        // ----------------------------------------------------------
        // 1. SELECTION STATEMENTS (Decision-Making)
        // ----------------------------------------------------------

        System.out.println("1. SELECTION STATEMENTS");

        // if
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        }

        // if-else
        int age = 17;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // if-else-if ladder
        int score = 76;
        if (score >= 90) {
            System.out.println("Performance: Excellent");
        } else if (score >= 75) {
            System.out.println("Performance: Good");
        } else {
            System.out.println("Performance: Needs Improvement");
        }

        // switch
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid Day");
        }

        System.out.println();


        // ----------------------------------------------------------
        // 2. ITERATION STATEMENTS (Loops)
        // ----------------------------------------------------------

        System.out.println("2. ITERATION STATEMENTS (LOOPS)");

        // for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // while loop
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop:");
        int n = 1;
        do {
            System.out.println("Value: " + n);
            n++;
        } while (n <= 3);

        // enhanced for loop
        System.out.println("\nEnhanced For Loop:");
        int[] arr = {10, 20, 30, 40};
        for (int value : arr) {
            System.out.println(value);
        }

        System.out.println();


        // ----------------------------------------------------------
        // 3. JUMP STATEMENTS
        // ----------------------------------------------------------

        System.out.println("3. JUMP STATEMENTS");

        // break
        System.out.println("\nBreak Statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }

        // continue
        System.out.println("\nContinue Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }

        // return (demonstrated via method)
        System.out.println("\nReturn Statement (Method Call):");
        int result = add(7, 3);
        System.out.println("Addition Result: " + result);

        System.out.println("\n=== END OF DEMO ===");
    }

    // return statement example
    public static int add(int a, int b) {
        return a + b;  // returns value to calling method
    }
}
