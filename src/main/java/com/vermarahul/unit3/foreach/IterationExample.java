package com.vermarahul.unit3.foreach;

import com.vermarahul.unit1.u1.Person;

import java.util.Arrays;
import java.util.List;

public class IterationExample {

    public static  void  main(String[] args){

        List<Person> list = Arrays.asList(
                new Person("Rahul", "Verma", 36),
                new Person("Rohit", "Verma", 34),
                new Person("Maria", "Monaco", 34),
                new Person("James", "Buck", 34),
                new Person("Thomas", "Carl", 34)
        );

        list.forEach(p->System.out.println(p));
        //OR
        list.forEach(System.out::println);

    }
}
