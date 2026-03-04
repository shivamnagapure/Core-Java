package org.example.UtilityClasses.Collections.Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemoSearching {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(0);
        list.add(20);
        list.add(10);
        list.add(5);
        System.out.println(list);
        Collections.sort(list , Comparator.reverseOrder());
        System.out.println(list);
        System.out.println(Collections.binarySearch(list , 10 , Comparator.reverseOrder()));
        System.out.println(Collections.binarySearch(list , 13 , Comparator.reverseOrder()));
        System.out.println(Collections.binarySearch(list , 17 ));
    }
}
