// -----------------------------------------------------
// Using a Custom Exception in Java
// -----------------------------------------------------

public class CustomExceptionDemo {

    public static void validateAge(int age) throws CustomException {
        if (age < 0 || age > 120) {
            throw new CustomException("Age must be between 0 and 120.");
        }
        System.out.println("Valid age entered.");
    }

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(-10);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Age validation completed.");
        }
    }
}
