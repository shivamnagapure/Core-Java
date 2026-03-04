package org.example.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception {
        Temp t = new Temp();
        WeakHashMap<Temp , String> map = new WeakHashMap<>();
        map.put(t , "Shivam") ;
        System.out.println(map);
        t = null ;
        System.gc();
        Thread.sleep(1000);
        System.out.println(map);
    }
}

class Temp {
    public String toString(){
        return "temp" ;
    }
}
