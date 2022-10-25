package com.vermarahul.unit1.u1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7Solution {

    public static  void  main(String[] args){

        List<Person> list = Arrays.asList(
                new Person("Rahul", "Verma", 36),
                new Person("Rohit", "Verma", 34),
                new Person("Maria", "Carlos", 34),
                new Person("James", "Buck", 34),
                new Person("Thomas", "Carl", 34)
        );

        //Step 1: Sort list by Last list name
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //Step 2: Create a method that prints all elements in the list.
        printAll(list);
        //Step 3: Create a method that prints all people having lastName starting with C.
        printNameStartingWith(list, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });


    }
    public static void printAll(List<Person> person){
        for(Person p : person){
            System.out.println(p.toString());
        }
    }
    public static void printNameStartingWith(List<Person> person, Condition condition){
        for(Person p : person){
            if(condition.test(p)){
                System.out.println("printNameStartingWith=" + p);
            }
        }
    }

    interface Condition{
        public boolean test(Person person);
    }
}
