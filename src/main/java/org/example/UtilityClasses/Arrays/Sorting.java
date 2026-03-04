package org.example.UtilityClasses.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        int[] a = {10 , 5 , 20 , 11 ,6} ;
        Arrays.sort(a);
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();

        String[] s = {"A" , "Z" , "B"};
        Arrays.sort(s);
        for(String i : s){
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.sort(s , Comparator.reverseOrder());
        for(String i : s){
            System.out.print(i + " ");
        }
    }
}
