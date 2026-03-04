package org.example.Java8.DefaultMethod;

public interface A {
    default void m1() {
        System.out.println("A");
    }
}
