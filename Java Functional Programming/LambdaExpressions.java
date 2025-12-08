@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaDemo {
    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello from Lambda!");
        greet.sayHello();
    }
}
