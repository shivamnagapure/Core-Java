package org.example.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class BufferObjects {

    public static void main(String[] args) {
//        TreeSet<StringBuffer> t1 = new TreeSet<>() ;
        //1. Using Separate Class

        //Using Anonymous Class

//        TreeSet<StringBuffer> t1 = new TreeSet<>(new Comparator<StringBuffer>() {
//            @Override
//            public int compare(StringBuffer o1, StringBuffer o2) {
//                return o2.compareTo(o1);
//            }
//        }) ;

        //Using Lambada Function
//        TreeSet<StringBuffer> t1 = new TreeSet<>( (o1 , o2) -> -o1.compareTo(o2)) ;

        //Using TreeSet Methods
        TreeSet<StringBuffer> t1 = new TreeSet<>(Comparator.reverseOrder());//reverseOrder() -> reverse of Natural Default Order


        t1.add(new StringBuffer("Rohan"));
        t1.add(new StringBuffer("Shivam"));
        t1.add(new StringBuffer("Raja"));
        t1.add(new StringBuffer("Ganesh"));
        t1.add(new StringBuffer("RajKumar"));
        System.out.println(t1);

    }
}


