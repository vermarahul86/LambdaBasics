package com.vermarahul.unit2.closure;

public class ClosureExample {

    public static void main(String[] args){
            int a = 10;
            int b = 20;
            /*
            As soon as we try to modify the element, compiler gives error
            Variable used in lambda expression should be final or effectively final
            b= 21;

            Here compiler trusts that you will do things right, but if you try to modify compiler will catch you.

            It is anyway implicitly considered as final.
             */


            processElement(a, i -> System.out.println(i+b));
    }
public static void processElement(int i, ClosureLambda p){
        p.process(i);
}
    interface ClosureLambda {
        public void process(int a);
    }
}
