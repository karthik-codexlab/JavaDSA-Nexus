import java.util.concurrent.*;

public class CallableFutureDemo {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(500);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Result: " + future.get());

        executor.shutdown();
    }
}
