package java_design_patterns.behavioral;

import java.util.*;

interface Observer {
    void update(String status);
}

class UserObserver implements Observer {
    public void update(String status) {
        System.out.println("User notified: " + status);
    }
}

class OrderSubject {

    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String status) {
        observers.forEach(o -> o.update(status));
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        OrderSubject order = new OrderSubject();
        order.addObserver(new UserObserver());
        order.notifyAllObservers("ORDER_DISPATCHED");
    }
}
