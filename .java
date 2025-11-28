import java.util.LinkedList;

public class day11 {
    public static void main(String[] args) {

        LinkedList<String> deque = new LinkedList<>();

        deque.offer("TailElement");
        deque.offerFirst("FrontElement");
        deque.offerLast("LastElement");

        System.out.println("Initial deque: " + deque);

        String firstPeek = deque.peek();
        String firstPeekFirst = deque.peekFirst();
        String firstPeekLast = deque.peekLast();

        System.out.println("peek(): " + firstPeek);
        System.out.println("peekFirst(): " + firstPeekFirst);
        System.out.println("peekLast(): " + firstPeekLast);

        String pollElement = deque.poll();
        System.out.println("poll(): " + pollElement + ", deque: " + deque);

        String pollFirstElement = deque.pollFirst();
        System.out.println("pollFirst(): " + pollFirstElement + ", deque: " + deque);

        String pollLastElement = deque.pollLast();
        System.out.println("pollLast(): " + pollLastElement + ", deque: " + deque);

        deque.push("StackPush1");
        System.out.println("After push: " + deque);

        String popped = deque.pop();
        System.out.println("pop(): " + popped + ", deque: " + deque);
    }
}
