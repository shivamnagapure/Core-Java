package org.example.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        System.out.println(queue.peek());
        for (int i = 0; i <= 10; i++) {
            queue.offer(i) ;
        }
        System.out.println(queue);
        System.out.println( queue.poll());
        System.out.println( queue.poll());
        System.out.println(queue);

    }
}
