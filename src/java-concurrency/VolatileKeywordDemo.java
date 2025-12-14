public class VolatileKeywordDemo {

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            while (running) {
                // busy wait
            }
            System.out.println("Thread stopped.");
        });

        worker.start();
        Thread.sleep(1000);

        running = false;
    }
}
