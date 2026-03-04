package org.example.Java8.DefaultMethod;

public interface B {
    default void m1(){
        System.out.println("B");
    }
}