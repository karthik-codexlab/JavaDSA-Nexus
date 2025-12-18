package java_design_patterns.behavioral;

interface DeliveryStrategy {
    int calculateTime();
}

class BikeDelivery implements DeliveryStrategy {
    public int calculateTime() {
        return 20;
    }
}

class CarDelivery implements DeliveryStrategy {
    public int calculateTime() {
        return 30;
    }
}

class DeliveryContext {

    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public int execute() {
        return strategy.calculateTime();
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();
        context.setStrategy(new BikeDelivery());
        System.out.println(context.execute());
    }
}
