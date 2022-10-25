package com.vermarahul.unit1.typeinterface;

public class TypeInterfaceExample {

    public static void main(String[] args){
        StringLambdaInterface type1 = (String s) -> s.length();
        StringLambdaInterface type2 = (s) -> s.length();
        StringLambdaInterface type3 = s -> s.length();

        System.out.println("Length from Type1 = " + type1.getLength("Hello World"));
        System.out.println("Length from Type2 = " + type2.getLength("Hello World"));
        System.out.println("Length from Type3 = " + type3.getLength("Hello World"));

        printLambdaLength(s -> s.length(),"What is my name");


    }
    public static void printLambdaLength(StringLambdaInterface sli, String name){
        System.out.println(sli.getLength(name));
    }


    @FunctionalInterface
    interface StringLambdaInterface{
        int getLength(String string);


    }
}
