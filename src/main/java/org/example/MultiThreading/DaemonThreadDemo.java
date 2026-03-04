package org.example.MultiThreading;

//After Terminating last Non-Daemon Thread all Daemon threads terminated irrespective of their position
class ThreadD extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) {
        ThreadD t = new ThreadD();
        t.setDaemon(true);
        t.start();
        System.out.println("End Of Mai Thread");
    }
}
