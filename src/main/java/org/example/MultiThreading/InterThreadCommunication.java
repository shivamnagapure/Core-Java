package org.example.MultiThreading;

public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException{
        ThreadA t = new ThreadA();
        t.start();
        synchronized (t){
            System.out.println("Main Thread Calling wait Method");
            t.wait();
            System.out.println("Main thread got notification");
            System.out.println(t.total);
        }
    }
}

class ThreadA extends Thread{
    int total ;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child Thread starting Calculation");
            for (int i = 0; i < 100; i++) {
                total = total + 1 ;
            }
            System.out.println("Child Thread giving Notification");
            this.notify();
        }
    }
}
