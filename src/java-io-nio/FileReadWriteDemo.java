import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteDemo {

    public static void main(String[] args) {
        String fileName = "sample.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Java File I/O demonstration");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
