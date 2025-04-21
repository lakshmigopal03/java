import java.util.Deque;
import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("front1");
        deque.addLast("rear1");
        deque.addFirst("front2");
        deque.addLast("rear2");

        System.out.println("Queue after additions: " + deque);

        String removedFront = deque.removeFirst();
        String removedRear = deque.removeLast();

        System.out.println("Removed from front: " + removedFront);
        System.out.println("Removed from rear: " + removedRear);

        System.out.println("Deque after deletions: " + deque);
    }
}

