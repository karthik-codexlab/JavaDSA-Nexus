public class ThreadBasics {

    static class Worker extends Thread {
        @Override
        public void run() {
            System.out.println("Thread running: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Worker t1 = new Worker();
        Worker t2 = new Worker();

        t1.start();
        t2.start();
    }
}
