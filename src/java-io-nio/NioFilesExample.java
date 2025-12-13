import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class NioFilesExample {

    public static void main(String[] args) {
        Path path = Paths.get("nio-demo.txt");

        try {
            Files.write(path, "Modern Java NIO API".getBytes());

            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
