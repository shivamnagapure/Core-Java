package org.example.HashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Shivam" , 1000);
        map.put("Prajkata" , 2000);
        map.put("Venkatesha" , 3500);
        map.put("Ram" , 2500);
        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values =  map.values();
        System.out.println(values);
        Set<Map.Entry<String , Integer>> entrySet = map.entrySet() ;
        System.out.println(entrySet);
        Iterator<Map.Entry<String , Integer>> itr = entrySet.iterator() ;
        while (itr.hasNext()){
            Map.Entry<String , Integer> entry = itr.next() ;
            if(entry.getKey().equals("Shivam") ){
                entry.setValue(50000) ;
            }
        }
        System.out.println(entrySet);
    }
}
