package java_design_patterns.structural;

interface OrderCost {
    double cost();
}

class BaseOrder implements OrderCost {
    public double cost() {
        return 200;
    }
}

class PriorityDelivery implements OrderCost {

    private final OrderCost order;

    public PriorityDelivery(OrderCost order) {
        this.order = order;
    }

    public double cost() {
        return order.cost() + 50;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        OrderCost order =
                new PriorityDelivery(new BaseOrder());
        System.out.println(order.cost());
    }
}
