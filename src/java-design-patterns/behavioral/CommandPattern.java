package java_design_patterns.behavioral;

interface Command {
    void execute();
}

class CancelOrderCommand implements Command {
    public void execute() {
        System.out.println("Order cancelled");
    }
}

class OrderInvoker {
    public void invoke(Command command) {
        command.execute();
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        new OrderInvoker().invoke(new CancelOrderCommand());
    }
}
