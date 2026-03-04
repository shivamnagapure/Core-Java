package org.example.Java8.PredifinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateInterf {
    public static void main(String[] args) {
        Predicate<Integer> p  = e -> e > 1000 ;

        System.out.println(p.test(1001));


        String[] str ={"Nag","Chiranjeevi", "Venkatesth", "Balaiah", "Sunny", "Katrina"};
        Predicate<String> lengthCheck =  s -> s.length() > 5 ;
        for(String s : str){
//            System.out.println(lengthCheck.test(s));

            if(lengthCheck.test(s)) System.out.println(s);
        }
    }
}
