package org.example.MultiThreading;

class MyThread extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("I am Lasy Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("MyThread Interrupted");
        }

    }
}
public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException{
        MyThread t = new MyThread() ;
        t.start();
        Thread.sleep(3000);
        t.interrupt();
        System.out.println("Main Thead Finished");
    }
}
