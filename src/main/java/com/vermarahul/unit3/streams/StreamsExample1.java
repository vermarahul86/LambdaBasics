package com.vermarahul.unit3.streams;

import com.vermarahul.unit1.u1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args){
        List<Person> list = Arrays.asList(
                new Person("Rahul", "Verma", 36),
                new Person("Rohit", "Verma", 34),
                new Person("Maria", "Monaco", 34),
                new Person("James", "Buck", 34),
                new Person("Thomas", "Carl", 34)
        );

       // list.stream().forEach(p-> System.out.println(p.getFirstName() + " " + p.getLastName()));
        list.stream().
                filter(person -> person.getLastName().startsWith("C")).
                forEach(p-> System.out.println(p.getFirstName() + " " + p.getLastName())); //Terminal Operation : End Operation.

        list.parallelStream(). //This could potentially split into multiple stream if it finds it is better to do.
                filter(person -> person.getLastName().startsWith("C")).
                forEach(p-> System.out.println(p.getFirstName() + " " + p.getLastName())); //Terminal Operation : End Operation.

    }
}
