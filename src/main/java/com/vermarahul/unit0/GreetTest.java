package com.vermarahul.unit0;

public class GreetTest {

    public void perform(Greeter greeter){
        greeter.greet();
    }
    public  static void main (String[] args){
        //Old way
        GreetTest greetTest = new GreetTest();
        greetTest.perform(new GreetAll());

        //New way - Lambda Expression
        GreeterLambda firstInterfaceLambda = () -> System.out.println("Hello Everyone from Functional Interface :: greetLambda");
        firstInterfaceLambda.greetLambda();

        //Inline Implementations - Not appreciated - inner class
        GreeterLambda secondInterfaceLambda = new GreeterLambda() {
            @Override
            public void greetLambda() {
                System.out.println("Hello Everyone from Functional Interface :: inline Implementations");
            }
        };
        secondInterfaceLambda.greetLambda();


    }


}

