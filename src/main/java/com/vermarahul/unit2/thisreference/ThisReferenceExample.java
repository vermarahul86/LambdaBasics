package com.vermarahul.unit2.thisreference;

public class ThisReferenceExample
{

    public static void main(String[] args){

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        //Old way
        thisReferenceExample.doProcessing(10, new ThisReferenceLambda() {
            @Override
            public void process(int i) {
                System.out.println("Value of 'i' is =" + i);
                System.out.println(this); //here this is pointing to instance of anonymous implementation.
            }
            @Override
            public String toString(){return "Inside Anonymous";}
        });

        //lAMBDA WAY - 1
        thisReferenceExample.doProcessing(11, i -> {
            System.out.println("Value of 'i' is =" + i);
           // System.out.println(this); //Won't work cannot refer from static - Basics.
        });

        //Lambda way - 2
        thisReferenceExample.execute();

/* SO in a nut shell you can see that "this" get overridden in case of anonymous, but in case of Lambda it still points
to the same as it would to the outside of Lambda expression.
* */

    }

    public void execute(){
        doProcessing(11, i -> {
            System.out.println("Value of 'i' is =" + i);
            System.out.println(this); //Works as it is referring to instance of ThisReferenceExample
        });
    }

    public void doProcessing(int i, ThisReferenceLambda trl){
        trl.process(i);
    }

    interface ThisReferenceLambda{
        void process(int i);
    }

    @Override
    public String toString(){return "Inside ThisReferenceExample";}
}
