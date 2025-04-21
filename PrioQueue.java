import java.util.PriorityQueue;

public class PrioQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("alpha");
        pq.add("beta");
        pq.add("gamma");

        System.out.println("Priority queue elements: ");
        System.out.println(pq);

        System.out.println("Head of the queue: " + pq.peek());

        System.out.println("Removed element: " + pq.poll());

        System.out.println("New head of the queue: " + pq.peek());

        System.out.println("Remaining elements: ");
        for (String str : pq) {
            System.out.println(str);
        }
    }
}
