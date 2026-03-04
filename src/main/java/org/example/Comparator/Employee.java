package org.example.Comparator;

import java.util.Objects;
import java.util.TreeSet;

//User Defined class
public class Employee implements Comparable<Object>{
    int eid ;
    String name ;

    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public String toString(){
        return name + "__" + eid ;
    }

    @Override
    public int compareTo(Object obj) {// this is obj2(Previous Object already inserted) .
        int eid1 = this.eid ; // this is obj , is to be inserted .
        Employee e = (Employee) obj ;
        int eid2 = e.eid ;
        if(eid1 < eid2){
            return -1 ;
        }
        else if(eid1 > eid2){
            return +1 ;
        }
        else {
            return 0 ;
        }
    }
}

class CompComp{
    public static void main(String[] args) {
        TreeSet<Employee> t = new TreeSet<>() ;
        t.add(new Employee(10 , "Shiva"));
        t.add(new Employee(20 , "Ram"));
        t.add(new Employee(100 , "Soham"));
        t.add(new Employee(10 , "Shiva"));
        t.add(new Employee(50 , "Rama"));

        System.out.println(t);

    }
}
