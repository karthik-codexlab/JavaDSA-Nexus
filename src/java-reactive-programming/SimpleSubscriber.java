import java.util.concurrent.Flow;

public class SimpleSubscriber implements Flow.Subscriber<String> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        System.out.println("[Subscriber] Subscribed");
        subscription.request(1); // request first item
    }

    @Override
    public void onNext(String item) {
        System.out.println("[Subscriber] Received: " + item);

        try {
            Thread.sleep(800); // simulate slow consumer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        subscription.request(1); // request next item
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println("[Subscriber] Error: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("[Subscriber] All items processed");
    }
}
