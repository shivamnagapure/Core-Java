package org.example.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
//        PriorityQueue<String> q = new PriorityQueue<>( (obj1 , obj2) -> obj2.compareTo(obj1));
        PriorityQueue<String> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("S");
        System.out.println(q);
    }
}
