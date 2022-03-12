package programmer;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        /**
         * Deque (LIFO & FIFO)
         * digunakan untuk stack (tumpukan)
         */
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Fajar");
        stack.offerLast("Nur");
        stack.offerLast("Rohman");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Fajar");
        queue.offerLast("Nur");
        queue.offerLast("Rohman");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
