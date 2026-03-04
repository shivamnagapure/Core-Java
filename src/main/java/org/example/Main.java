package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Shiv");
        StringBuilder s2 = new StringBuilder("Shiv");
        StringBuffer a1 = new StringBuffer("Shiv");
        StringBuffer a2 = new StringBuffer("Shiv");
        String s3 = new String("Shivam");
        String s4 = new String("Shivam");
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(a2));
    }
}