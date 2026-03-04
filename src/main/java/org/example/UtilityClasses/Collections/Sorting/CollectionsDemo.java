package org.example.UtilityClasses.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        System.out.println(l);
//        Collections.sort(l , (obj1 , obj2) -> obj2.compareTo(obj1) );
        Collections.sort(l ,Comparator.reverseOrder()); //reverse of natural sorting order
        System.out.println(l);
    }
}
