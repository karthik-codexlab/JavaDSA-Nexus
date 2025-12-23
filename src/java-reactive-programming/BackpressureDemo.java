import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class BackpressureDemo {

    public static void main(String[] args) throws Exception {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        
        Flow.Subscriber<Integer> slowSubscriber = new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("[Subscriber] Processing: " + item);
                try {
                    Thread.sleep(1000); // very slow processing
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error: " + throwable);
            }

            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
        };

        publisher.subscribe(slowSubscriber);

        for (int i = 1; i <= 5; i++) {
            System.out.println("[Publisher] Sending: " + i);
            publisher.submit(i);
        }

        publisher.close();
        Thread.sleep(7000);
    }
}
