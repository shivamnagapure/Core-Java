package org.example.MultiThreading;

class Display {
    public synchronized void wish(String name){
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning :");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}

class MyThread1 extends Thread{

    private final Display d ;
    private final String name ;

    public MyThread1(Display d ,String name) {
        this.d = d ;
        this.name = name ;
    }

    public void run(){
        d.wish(name);
    }
}


public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d  = new Display();
        // Using Lambda Function
//        Runnable r1 = () -> d.wish("Shivam");
//        Runnable r2 = () -> d.wish("Harsh");
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);


//        Thread t1 = new Thread( () -> d.wish("shiv"));
//        Thread t2 = new Thread( () -> d.wish("harsh"));

        MyThread1 t1 = new MyThread1(d ,"Dhoni");
        MyThread1 t2 = new MyThread1(d ,"Shivam");


        t1.start();
        t2.start();
    }
}
