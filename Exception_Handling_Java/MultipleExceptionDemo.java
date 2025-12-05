// -----------------------------------------------------
// Handling multiple exceptions in a single block
// -----------------------------------------------------

public class MultipleExceptionDemo {

    public static void readArray(int[] arr, int index) {
        try {
            System.out.println("Value: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } catch (NullPointerException e) {
            System.out.println("Error: Array is null.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            System.out.println("Read operation completed.\n");
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};

        readArray(nums, 1);
        readArray(nums, 5);
        readArray(null, 2);
    }
}
