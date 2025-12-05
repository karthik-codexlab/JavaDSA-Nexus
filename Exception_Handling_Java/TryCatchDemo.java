// -----------------------------------------------------
// Basic Exception Handling using try-catch-finally
// -----------------------------------------------------

public class TryCatchDemo {

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.\n");
        }
    }

    public static void main(String[] args) {
        divide(10, 2);
        divide(5, 0);
        divide(10, Integer.parseInt("5"));
    }
}
