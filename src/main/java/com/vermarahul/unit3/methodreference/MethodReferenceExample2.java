package com.vermarahul.unit3.methodreference;

import com.vermarahul.unit1.u1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {



    public static  void  main(String[] args){

        List<Person> list = Arrays.asList(
                new Person("Rahul", "Verma", 36),
                new Person("Rohit", "Verma", 34),
                new Person("Maria", "Monaco", 34),
                new Person("James", "Buck", 34),
                new Person("Thomas", "Carl", 34)
        );

        //printConditionally(list, p-> true, p-> System.out.println(p));
        //1 Argument used and 1 passed - Example of pass through.
    //OR
        printConditionally(list, p-> true, System.out::println);

    }

    public static void printConditionally(List<Person> person, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : person){
            if(predicate.test(p)){consumer.accept(p);}
        }
    }

}
