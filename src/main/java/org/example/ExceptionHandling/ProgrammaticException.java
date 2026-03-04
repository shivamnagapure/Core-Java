package org.example.ExceptionHandling;

public class ProgrammaticException extends IllegalArgumentException{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1st");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2nd");
            }
        });

        t1.setPriority(10);
        t2.setPriority(11);
    }
}
