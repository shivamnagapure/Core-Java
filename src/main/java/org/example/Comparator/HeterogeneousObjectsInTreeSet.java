package org.example.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class HeterogeneousObjectsInTreeSet {
    public static void main(String[] args) {

        //Using Anonymous Class
        TreeSet t = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = o1.toString() ;
                String s2 = o2.toString() ;

                int l1 = s1.length() ;
                int l2 = s2.length() ;

                if(l1 < l2){
                    return -1 ;
                } else if (l1 > l2) {
                    return +1 ;
                }else {
                    return s1.compareTo(s2) ;
                }
            }
        });
        

        // using lambada function
//        TreeSet t = new TreeSet( (obj1 , obj2) -> {
//            String s1 = obj1.toString() ;
//            String s2 = obj2.toString() ;
//
//            int l1 = s1.length() ;
//            int l2 = s2.length() ;
//
//            if(l1 < l2){
//                return -1 ;
//            } else if (l1 > l2) {
//                return +1 ;
//            }else {
//                return s1.compareTo(s2) ;
//            }
//        });

        t.add("S") ;
        t.add("AA") ;
        t.add(new StringBuffer("XX")) ;
        t.add(new StringBuffer("ABCD")) ;
        t.add("ABC") ;

        System.out.println(t);

    }
}
