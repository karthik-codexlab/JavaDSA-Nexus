import java.io.*;

public class BufferedStreamExample {

    public static void main(String[] args) {
        String fileName = "buffered.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Buffered I/O improves performance");
            System.out.println("Buffered write completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading using BufferedReader:");
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
