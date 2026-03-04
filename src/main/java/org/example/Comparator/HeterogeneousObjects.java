package org.example.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class HeterogeneousObjects {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(Comparator.naturalOrder()); ;
        t.add("Shiv");
        t.add("10");// if we are not implementing compare method on own then heterogeneous objets are not allowed

        System.out.println(t);
    }
}
