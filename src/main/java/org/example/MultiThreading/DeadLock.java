package org.example.MultiThreading;

class Resource1{
    public synchronized void a1(Resource2 r2){
        System.out.println("Inside Resource1");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("r2.last()");
        r2.last();
    }

    public synchronized void last(){

    }
}

class Resource2{
    public synchronized void b1(Resource1 r1){
        System.out.println("Inside Resource1");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("r1.last()");
        r1.last();
    }
    public synchronized void last(){

    }
}


public class DeadLock {
    public static void main(String[] args) {
        Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();

        Thread t1 = new Thread( () -> r2.b1(r1));
        Thread t2 = new Thread( () -> r1.a1(r2));
        t1.start();
        t2.start();


    }
}

