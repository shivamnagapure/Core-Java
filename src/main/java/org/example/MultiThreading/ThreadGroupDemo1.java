package org.example.MultiThreading;

class ThreadGroupThread extends Thread{

    ThreadGroupThread(ThreadGroup g , String name){
        super(g,name);
    }

    public void run(){
        System.out.println("Child Thread");
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadGroupDemo1 {
    public static void main(String[] args) {

        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg , "Child Group");

        ThreadGroupThread t1 = new ThreadGroupThread(pg , "ChildThread1");
        ThreadGroupThread t2 = new ThreadGroupThread(pg , "ChildThread2");

        t1.start();
        t2.start();

        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();// print info about Thread Group in console


    }
}

