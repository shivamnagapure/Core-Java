package org.example.Java8.StaticMethod;

public class A extends B implements Interf {

    public void m3(){
//        super.m2(); not Allowed
        A.m2();
        B.m2();
    }

    public static void main(String[] args) {
        A a = new A() ;
//        a.m1() ;  interface static method Cannot access by implementation class obj
        a.m2();
    }
}
