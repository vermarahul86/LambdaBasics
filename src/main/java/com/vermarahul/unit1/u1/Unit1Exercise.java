package com.vermarahul.unit1.u1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {

    public static  void  main(String[] args){

        List<Person> list = Arrays.asList(
                new Person("Rahul", "Verma", 36),
                new Person("Rohit", "Verma", 34),
                new Person("Maria", "Monaco", 34),
                new Person("James", "Buck", 34),
                new Person("Thomas", "Carl", 34)
        );

        //Step 1: Sort list by Last list name
        Collections.sort(list, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        System.out.println(list);
        //Step 2: Create a method that prints all elements in the list.
        printConditionally(list, p-> true);

        //Step 3: Create a method that prints all people having lastName starting with C.
        printConditionally(list, p-> p.getLastName().startsWith("C"));


    }
    interface ConditionLambda{
        public boolean test(Person person);
    }
    public static void printConditionally(List<Person> person, ConditionLambda condition){
        for(Person p : person){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }
}
