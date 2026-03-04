package org.example.ExceptionHandling;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        
        doStuff();

    }

    public static void doStuff() {
        try{
            doMoreStuff();
        } catch (InterruptedException e){
            System.out.println(e);
        }

    }

    private static void doMoreStuff() throws InterruptedException{
        Thread.sleep(10000);
    }

}
