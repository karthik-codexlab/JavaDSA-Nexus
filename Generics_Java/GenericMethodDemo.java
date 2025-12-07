public class GenericMethodDemo {

    // Generic method
    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        display(10);
        display("Hello");
        display(25.5);
    }
}
