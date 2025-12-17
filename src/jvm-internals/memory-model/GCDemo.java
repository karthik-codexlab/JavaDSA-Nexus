package garbagecollection;

public class GCDemo {

    @Override
    protected void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GCDemo obj = new GCDemo();
        obj = null; // Object becomes unreachable

        System.gc(); // Request GC
        System.out.println("End of main");
    }
}
