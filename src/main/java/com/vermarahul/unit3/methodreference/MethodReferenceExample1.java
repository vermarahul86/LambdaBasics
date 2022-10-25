package com.vermarahul.unit3.methodreference;

public class MethodReferenceExample1 {

    public static void main(String[] args){

        //Usual way of Lambda Expression.
        Thread thread1 = new Thread(()-> printMessage()); //0 Argument used and 0 passed - Example of pass through.
        thread1.start();
                    //OR
        //Method referencing way
        Thread thread2 = new Thread(MethodReferenceExample1::printMessage);
        thread2.start();

    }

    public static void printMessage(){
        System.out.println("Hello we are printing message");
    }
}
