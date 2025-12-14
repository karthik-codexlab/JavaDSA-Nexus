public class RunnableVsThread {

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable executed by: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());

        t1.start();
        t2.start();
    }
}
