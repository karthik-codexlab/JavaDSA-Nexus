import java.util.concurrent.Flow;

public class ReactiveDemo {

    public static void main(String[] args) throws Exception {
        Flow.Publisher<String> publisher = SimplePublisher.createPublisher();
        SimpleSubscriber subscriber = new SimpleSubscriber();

        publisher.subscribe(subscriber);

        // Keep JVM alive
        Thread.sleep(5000);
    }
}
