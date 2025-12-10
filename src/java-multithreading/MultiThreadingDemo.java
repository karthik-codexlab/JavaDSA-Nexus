/**
 * Java Multithreading Concepts Demo
 * 
 * This file demonstrates:
 * 1. Creating threads using Thread class and Runnable interface
 * 2. Using synchronized methods to avoid race conditions
 * 3. Producer-Consumer using wait() and notify()
 * 4. ExecutorService and ThreadPool
 * 5. Callable + Future (return values from threads)
 */

import java.util.concurrent.*;

public class MultiThreadingDemo {

    // -----------------------------------------------------------
    // 1. Thread Creation by Extending Thread Class
    // -----------------------------------------------------------
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread using Thread class → " + Thread.currentThread().getName());
        }
    }

    // -----------------------------------------------------------
    // 2. Thread Creation by Implementing Runnable
    // -----------------------------------------------------------
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread using Runnable → " + Thread.currentThread().getName());
        }
    }

    // -----------------------------------------------------------
    // 3. Synchronization Demo (Avoiding Race Condition)
    // -----------------------------------------------------------
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    // -----------------------------------------------------------
    // 4. Producer-Consumer Problem (wait & notify)
    // -----------------------------------------------------------
    static class SharedResource {
        private int data;
        private boolean hasValue = false;

        public synchronized void produce(int value) throws InterruptedException {
            while (hasValue) {
                wait();
            }
            this.data = value;
            hasValue = true;
            System.out.println("Produced: " + value);
            notify(); // notify consumer
        }

        public synchronized int consume() throws InterruptedException {
            while (!hasValue) {
                wait();
            }
            hasValue = false;
            System.out.println("Consumed: " + data);
            notify(); // notify producer
            return data;
        }
    }

    // -----------------------------------------------------------
    // 5. Callable for returning values from threads
    // -----------------------------------------------------------
    static class SumTask implements Callable<Integer> {
        private final int n;

        public SumTask(int n) {
            this.n = n;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;
            return sum;
        }
    }

    // -----------------------------------------------------------
    // Main Method – Execute All Examples
    // -----------------------------------------------------------
    public static void main(String[] args) throws Exception {

        System.out.println("=== Thread using Thread class ===");
        Thread t1 = new MyThread();
        t1.start();

        System.out.println("=== Thread using Runnable ===");
        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        // -------------------------------------------------------
        // Synchronization Example
        // -------------------------------------------------------
        System.out.println("\n=== Synchronization Example ===");
        Counter counter = new Counter();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("Final Counter Value: " + counter.getCount());

        // -------------------------------------------------------
        // Producer-Consumer using wait/notify
        // -------------------------------------------------------
        System.out.println("\n=== Producer-Consumer (wait/notify) ===");
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) resource.produce(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) resource.consume();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        // -------------------------------------------------------
        // ExecutorService – ThreadPool Example
        // -------------------------------------------------------
        System.out.println("\n=== ExecutorService (Thread Pool) ===");
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(() -> System.out.println("Task 1 running..."));
        service.submit(() -> System.out.println("Task 2 running..."));
        service.submit(() -> System.out.println("Task 3 running..."));

        service.shutdown();

        // -------------------------------------------------------
        // Callable + Future Example
        // -------------------------------------------------------
        System.out.println("\n=== Callable + Future Example ===");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new SumTask(10));

        System.out.println("Sum of 1 to 10 = " + future.get());
        
        executor.shutdown();
    }
}
