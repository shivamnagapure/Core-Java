package org.example.Hashtable;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Temp , String> h = new Hashtable<>();
        h.put(new Temp(5) , "A");
        h.put(new Temp(2) , "B");
        h.put(new Temp(6) , "C");
        h.put(new Temp(15) , "D");
        h.put(new Temp(23) , "E");
        h.put(new Temp(16) , "F");
        System.out.println(h);
    }
}

class Temp {
    int i ;

    public Temp(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "i=" + i +
                '}';
    }
}
