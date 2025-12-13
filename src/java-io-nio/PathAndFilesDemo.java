import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesDemo {

    public static void main(String[] args) {
        Path path = Paths.get("data/info.txt");

        System.out.println("File Name: " + path.getFileName());
        System.out.println("Absolute Path: " + path.toAbsolutePath());
        System.out.println("Parent Directory: " + path.getParent());
    }
}
