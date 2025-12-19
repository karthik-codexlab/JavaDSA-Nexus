package java_memory_management;

/**
 * Demonstrates the lifecycle of a Java object.
 */
public class ObjectLifecycle {

    static class DemoObject {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called before GC");
        }
    }

    public static void main(String[] args) {
        DemoObject obj = new DemoObject();
        obj = null; // Eligible for GC

        System.gc(); // Request GC (not guaranteed)
        System.out.println("GC requested");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {}
    }
}
