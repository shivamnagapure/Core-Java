package org.example.Java8.PredifinedFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    int salary ;
    String name ;

    public Employee(String name ,int salary) {
        this.salary = salary;
        this.name = name;
    }
}

class Test{
    public boolean checkSalary(Employee e){
        if(e.salary > 3000){
            return true ;
        }
        return false ;
    }
   // Predicate<Employee> p = e -> e.salary > 3000 ;

    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>() ;
        l.add(new Employee("Ravi",2000));
        l.add(new Employee("Shiva",3000));
        l.add(new Employee("Mahesh",4000));
        l.add(new Employee("Durga",1000));
        l.add(new Employee("Adarsh",5000));
        l.add(new Employee("Sagar",6000));


        Predicate<Employee> p = e -> e.salary > 3000 ;

        for (Employee e : l){
            if(p.test(e)) System.out.println(e.name);;
        }
    }




}
