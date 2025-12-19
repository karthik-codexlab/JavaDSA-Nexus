package java_memory_management;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates OutOfMemoryError.
 * Run with limited heap:
 * java -Xmx32m OutOfMemoryErrorDemo
 */
public class OutOfMemoryErrorDemo {

    public static void main(String[] args) {
        List<byte[]> memoryHog = new ArrayList<>();

        while (true) {
            memoryHog.add(new byte[1024 * 1024]); // 1 MB
            System.out.println("Allocating memory...");
        }
    }
}
