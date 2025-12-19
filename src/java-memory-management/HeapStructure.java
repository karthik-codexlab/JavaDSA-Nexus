package java_memory_management;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how objects are allocated in the Heap.
 * JVM places short-lived objects in Young Generation
 * and long-lived objects in Old Generation.
 */
public class HeapStructure {

    static class LargeObject {
        private byte[] data = new byte[1024 * 1024]; // 1 MB
    }

    public static void main(String[] args) throws InterruptedException {
        List<LargeObject> objects = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            objects.add(new LargeObject());
            System.out.println("Allocated object " + (i + 1));
            Thread.sleep(500);
        }

        System.out.println("Objects retained to avoid GC");
        Thread.sleep(5000);
    }
}
