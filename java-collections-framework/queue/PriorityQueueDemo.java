import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue (Min-Heap): " + pq);

        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll (removes smallest): " + pq.poll());
        System.out.println("After Poll: " + pq);
    }
}
