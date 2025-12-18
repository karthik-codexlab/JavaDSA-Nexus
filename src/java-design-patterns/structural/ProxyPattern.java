package java_design_patterns.structural;

interface OrderService {
    void placeOrder();
}

class RealOrderService implements OrderService {
    public void placeOrder() {
        System.out.println("Order placed successfully");
    }
}

class OrderServiceProxy implements OrderService {

    private final OrderService realService;
    private final boolean isAuthenticated;

    public OrderServiceProxy(OrderService realService, boolean auth) {
        this.realService = realService;
        this.isAuthenticated = auth;
    }

    public void placeOrder() {
        if (!isAuthenticated) {
            throw new SecurityException("Unauthorized");
        }
        realService.placeOrder();
    }
}
