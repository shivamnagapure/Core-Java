package org.example.MultiThreading;

import java.util.LinkedList;
import java.util.Queue;
//Not Correct
class Producer{
    private final Queue<Integer> queue ;
    int item ;

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void produce(int item){
        synchronized (queue){
            if(queue.size() > 5){
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    System.out.println("Exception");;
                }
            }
            System.out.println("Item Produced : " + item);
            queue.offer(item);
        }
    }
}

class Consumer{
    private final Queue<Integer> queue ;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void consume(){
        synchronized (queue){
            if(!queue.isEmpty()){
                System.out.println("Item Consumed : " + queue.poll());
                queue.notify();
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue) ;

        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 20; i++) {
                p.produce(i);
            }
        });
        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 20; i++) {
                c.consume();
            }
        });
        t1.start();
        t2.start();
    }
}
