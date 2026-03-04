package org.example.Java8.PredifinedFunctionalInterface.PrimitiveFnInterface;

import java.util.function.*;

public class Primitive {
    public static void main(String[] args) {
        ToIntFunction<Integer> square = n -> n*n ;
//        IntFunction<int> sum = s -> String.valueOf(s) ;
        System.out.println();

        DoubleUnaryOperator sum = n -> n * n ;
        System.out.println(sum.applyAsDouble(10));


        BinaryOperator<Integer> add = (a,b) -> a + b ;
        System.out.println(add.apply(10 , 20));


    }
}
