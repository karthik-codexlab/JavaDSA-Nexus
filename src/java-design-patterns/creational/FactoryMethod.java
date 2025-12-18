package java_design_patterns.creational;

interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class PaymentFactory {
    public static Payment getPayment(String type) {
        if (type.equalsIgnoreCase("UPI")) return new UpiPayment();
        if (type.equalsIgnoreCase("CARD")) return new CardPayment();
        throw new IllegalArgumentException("Invalid payment type");
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("UPI");
        payment.pay(500);
    }
}
