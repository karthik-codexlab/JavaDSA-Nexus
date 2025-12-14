import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<Void> future =
            CompletableFuture.supplyAsync(() -> {
                return "Java Concurrency";
            }).thenApply(result -> {
                return result + " with CompletableFuture";
            }).thenAccept(System.out::println);

        future.join();
    }
}
