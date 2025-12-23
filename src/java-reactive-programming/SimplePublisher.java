import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class SimplePublisher {

    public static Flow.Publisher<String> createPublisher() {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        new Thread(() -> {
            String[] messages = {
                "Order Created",
                "Payment Processed",
                "Order Shipped",
                "Order Delivered"
            };

            for (String msg : messages) {
                System.out.println("[Publisher] Publishing: " + msg);
                publisher.submit(msg);

                try {
                    Thread.sleep(500); // simulate async work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            publisher.close();
        }).start();

        return publisher;
    }
}
