package java_design_patterns.structural;

interface PaymentProcessor {
    void process(double amount);
}

class LegacyPaymentService {
    void makePayment(double amt) {
        System.out.println("Legacy payment: " + amt);
    }
}

class PaymentAdapter implements PaymentProcessor {

    private final LegacyPaymentService legacyService;

    public PaymentAdapter(LegacyPaymentService legacyService) {
        this.legacyService = legacyService;
    }

    public void process(double amount) {
        legacyService.makePayment(amount);
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        PaymentProcessor processor =
                new PaymentAdapter(new LegacyPaymentService());
        processor.process(300);
    }
}
