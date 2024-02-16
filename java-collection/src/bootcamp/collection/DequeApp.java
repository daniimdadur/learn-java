package bootcamp.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerFirst("Dani"); //(LIFO) Last In First Out
        stack.offerFirst("Imdadur");
        stack.offerFirst("Rohman");

        stack.offerLast("Dani"); //(FIFO) First In First Out
        stack.offerLast("Imdadur");
        stack.offerLast("Rohman");

        for (String value : stack) {
            System.out.println(value);
        }
        System.out.println();

        //mengambil data paling belakang.
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println();

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Dani");
        queue.offerLast("Imdadur");
        queue.offerLast("Rohman");

        //mengambil data paling depan seperti antrian
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
